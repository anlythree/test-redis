package top.anly.business;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.anly.business.params.SetGetParam;
import top.anly.common.util.MyRedisTemplate;
import top.anly.common.util.Result;

/**
 * @author wangli
 * @date 2021/5/25 22:36
 */
@Slf4j
@RestController
@RequestMapping(value = "/login/login", method = RequestMethod.POST)
public class TestController {

    @Autowired
    private MyRedisTemplate myRedisTemplate;

    @ApiOperation("登录接口")
    @RequestMapping(value = "/getOrSet")
    public Result getOrSet(@RequestBody SetGetParam param) {
        if(StringUtils.isNotEmpty(param.getValue())){
            myRedisTemplate.set(param.getKey(),param.getValue());
        }
        String value = myRedisTemplate.get(param.getKey()).toString();
        log.info("赋值成功");
        return Result.ok(value);
    }
}
