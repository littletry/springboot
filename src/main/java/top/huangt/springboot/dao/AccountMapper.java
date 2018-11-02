package top.huangt.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/02
 * Time 16:31
 */
@Mapper
public interface AccountMapper {

    int update(@Param("money") double money, @Param("id") int  id);
}
