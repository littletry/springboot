package top.huangt.springboot.storage;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/11/06
 * Time 16:46
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
