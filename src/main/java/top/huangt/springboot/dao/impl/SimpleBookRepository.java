package top.huangt.springboot.dao.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import top.huangt.springboot.dao.BookRepository;
import top.huangt.springboot.entity.Book;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/06
 * Time 15:02
 */
@Component
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable("books")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "Some book");
    }

    /**
     * Don't do this at home
     */
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
