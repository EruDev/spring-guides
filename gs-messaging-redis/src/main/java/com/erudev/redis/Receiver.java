package com.erudev.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 10:26
 */
public class Receiver {

    public static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    public AtomicInteger counter = new AtomicInteger();

    public void receiveMessage(String msg){
        LOGGER.info("Receive message: " + msg);
        counter.incrementAndGet();
    }

    public int getCount(){
        return counter.get();
    }
}
