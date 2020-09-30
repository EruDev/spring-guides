package com.erudev.actuatorservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 10:44
 */
@Controller
public class HelloWorldController {

    public final AtomicLong counter = new AtomicLong();
    public static final String template = "Hello, %s";

    @GetMapping("/hello")
    @ResponseBody
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Stranger", required = false)
                             String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
