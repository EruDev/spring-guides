package com.erudev.uploadingfiles.storge;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 9:22
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
