package top.huangt.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import top.huangt.springboot.entity.User;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/8/17
 * Time 9:42
 */
@Api(value = "/test", tags = "测试接口模块")
@RestController
@RequestMapping("/test")
public class TestSwaggerController {
    @ApiOperation(value = "展示首页信息", notes = "展示首页信息")
    @GetMapping("/show")
    public Object showInfo() {
        return "hello world";
    }

    @ApiOperation(value = "添加用户信息", notes = "添加用户信息")
    @ApiImplicitParam(name = "user", value = "User", required = true, dataType = "User")
    @PostMapping("/addUser")
    public Object addUser(@RequestBody User user) {
        return "success";
    }
}
