package top.huangt.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.huangt.springboot.dao.AccountMapper;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/02
 * Time 16:33
 */
@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional(rollbackFor = Exception.class)
    public void transfer() throws RuntimeException{
        accountMapper.update(90, 1);
        int i = 1/0;
        accountMapper.update(110, 2);
    }
}
