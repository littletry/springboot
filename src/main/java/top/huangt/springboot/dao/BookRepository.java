package top.huangt.springboot.dao;

import top.huangt.springboot.entity.Book;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/06
 * Time 15:01
 */
public interface BookRepository {

    Book getByIsbn(String isbn);
}
