package top.huangt.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.huangt.springboot.dao.AccountMapper;
import top.huangt.springboot.entity.Account;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/02
 * Time 16:09
 */
@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }
    public int update(String name, double money, int id) {
        return accountMapper.update(name, money, id);
    }
    public int delete(int id) {
        return accountMapper.delete(id);
    }
    public Account findAccount(int id) {
        return accountMapper.findAccount(id);
    }
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }
}
