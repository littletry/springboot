package top.huangt.springboot.common;

import top.huangt.springboot.entity.User;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/8/17
 * Time 11:14
 */
public class Test {
    public static void main(String[] args) {
        var a = 123;
        var b = "456";
        var c = a + b ;
        System.out.println(c);
        var arrayList = new ArrayList<User>();
        for (var i = 0; i < 10; i++){
            User user = new User();
            user.setId(String.valueOf(i));
            user.setBirthday(String.valueOf(i));
            user.setDescription(String.valueOf(i));
            user.setEmail(String.valueOf(i));
            user.setLastTime(String.valueOf(i));
            user.setLoginName(String.valueOf(i));
            user.setPassword(String.valueOf(i));
            user.setRegTime(String.valueOf(i));
            user.setSex(i % 2);
            user.setUserName(String.valueOf(i));
            arrayList.add(user);
        }
        System.out.println(arrayList.get(6));
    }
}
