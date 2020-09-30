package com.erudev.uploadingfiles.storge;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 9:17
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    public String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
