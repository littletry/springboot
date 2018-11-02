package top.huangt.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.huangt.springboot.dao.AccountDao;
import top.huangt.springboot.entity.Account;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/02
 * Time 15:05
 */
@Api(value = "/account", tags = "账户模块")
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountDao accountDao;

    @ApiOperation(value = "账户list", notes = "账户list")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return accountDao.findAll();
    }

    @ApiOperation(value = "根据id获取账户", notes = "根据id获取账户")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Object getAccountById(@PathVariable("id") int id) {
        return accountDao.findById(id);
    }

    @ApiOperation(value = "更新账户", notes = "更新账户")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        Account account1 = accountDao.saveAndFlush(account);

        return account1.toString();

    }

    @ApiOperation(value = "新增账户", notes = "新增账户")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        Account account1 = accountDao.save(account);
        return account1.toString();

    }
}
