package com.erudev.uploadingfiles.storge;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 8:57
 */
public class StorageFileNotFoundException extends RuntimeException{

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
