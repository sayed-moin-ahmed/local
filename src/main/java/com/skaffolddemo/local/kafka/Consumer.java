package com.skaffolddemo.local.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.time.LocalDate;

@Service
@Slf4j
public class Consumer {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
        updateItem(message);
        log.info(String.format("#### -> Consumed message -> %s", message));
    }
    private void updateItem(String message) {
        redisTemplate.opsForValue().set(LocalDate.now().toString(),message);
    }
}