package top.huangt.springboot.storage;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/06
 * Time 16:46
 */
public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
