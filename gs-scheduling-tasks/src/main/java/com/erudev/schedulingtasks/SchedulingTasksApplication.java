package com.erudev.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 13:25
 */
@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchedulingTasksApplication.class, args);
    }
}
