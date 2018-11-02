package top.huangt.springboot.dao;

import org.apache.ibatis.annotations.*;
import top.huangt.springboot.entity.Account;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/02
 * Time 16:08
 */
@Mapper
public interface AccountMapper {

    @Insert("insert into account(name, money) values(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("update account set name = #{name}, money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") double money, @Param("id") int  id);

    @Delete("delete from account where id = #{id}")
    int delete(int id);

    @Select("select id, name as name, money as money from account where id = #{id}")
    Account findAccount(@Param("id") int id);

    @Select("select id, name as name, money as money from account")
    List<Account> findAccountList();
}