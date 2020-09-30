package com.erudev.batchprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 12:42
 */
@SpringBootApplication
public class BatchProcessingApplication {
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args)));
    }
}
