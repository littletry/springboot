package top.huangt.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.huangt.springboot.service.AccountService;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/8/17
 * Time 9:42
 */
@Api(value = "/account", tags = "账户模块")
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @ApiOperation(value = "更新账户信息", notes = "更新账户信息")
    @GetMapping("/transfer")
    public void updateAccount() {
        accountService.transfer();
    }
}
