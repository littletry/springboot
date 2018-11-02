package top.huangt.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.huangt.springboot.entity.Account;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/02
 * Time 15:05
 */
public interface AccountDao extends JpaRepository<Account, Integer> {
}
