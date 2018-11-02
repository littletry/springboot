package top.huangt.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.huangt.springboot.entity.Account;
import top.huangt.springboot.service.IAccountService;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/02
 * Time 14:30
 */
@Api(value = "/account", tags = "AccountController")
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @ApiOperation(value = "查询账户列表", notes = "查询账户列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return accountService.findAccountList();
    }

    @ApiOperation(value = "根据id查询账户", notes = "根据id查询账户")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") int id){
        return accountService.findAccountById(id);
    }

    @ApiOperation(value = "根据id删除账户", notes = "根据id删除账户")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public  int delAccountById(@PathVariable("id") int id){
        return accountService.delete(id);
    }

    @ApiOperation(value = "更新账户", notes = "更新账户")
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateAccount(@PathVariable("id")int id ,
                                 @RequestParam(value = "name",required = true)String name,
                                 @RequestParam(value = "money" ,required = true)double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t=accountService.update(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @ApiOperation(value = "添加账户", notes = "添加账户")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String postAccount( @RequestParam(value = "name")String name,
                                @RequestParam(value = "money" )double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        int t= accountService.add(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }

    }
}
