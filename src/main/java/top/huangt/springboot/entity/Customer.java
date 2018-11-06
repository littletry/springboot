package top.huangt.springboot.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/06
 * Time 11:06
 */
public class Customer {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
