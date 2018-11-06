package top.huangt.springboot.storage;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/06
 * Time 16:46
 */
@Configuration("storage")
public class StorageProperties {

    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
