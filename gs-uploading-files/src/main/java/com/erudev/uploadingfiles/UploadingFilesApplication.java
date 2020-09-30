package com.erudev.uploadingfiles;

import com.erudev.uploadingfiles.storge.StorageProperties;
import com.erudev.uploadingfiles.storge.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 8:41
 */
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplication {
    public static void main(String[] args) {
        SpringApplication.run(UploadingFilesApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(StorageService storageService){
        return args -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
