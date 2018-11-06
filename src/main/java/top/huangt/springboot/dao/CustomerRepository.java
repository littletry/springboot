package top.huangt.springboot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import top.huangt.springboot.entity.Customer;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/06
 * Time 11:11
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);

}
