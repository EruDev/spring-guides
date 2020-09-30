package com.erudev.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 10:28
 */
@SpringBootApplication
public class MessagingRedisApplication {

    public static final Logger LOGGER = LoggerFactory.getLogger(MessagingRedisApplication.class);

    @Bean
    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory, MessageListenerAdapter adapter){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(adapter, new PatternTopic("chat"));

        return container;
    }

    @Bean
    MessageListenerAdapter messageListenerAdapter(Receiver receiver){
        return new MessageListenerAdapter(receiver, "receiveMessage");
    }

    @Bean
    StringRedisTemplate template(RedisConnectionFactory connectionFactory){
        return new StringRedisTemplate(connectionFactory);
    }

    @Bean
    Receiver receiver(){
        return new Receiver();
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(MessagingRedisApplication.class);
        StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
        Receiver receiver = ctx.getBean(Receiver.class);

        while (receiver.getCount() == 0){
            LOGGER.info("Sending message..");
            template.convertAndSend("chat", "Hello from Redis!");
            Thread.sleep(500L);
        }
        System.exit(0);
    }
}
