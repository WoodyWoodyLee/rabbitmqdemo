package com.leekin.rabbitmqdemo;

import com.leekin.rabbitmqdemo.publisher.Publisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqdemoApplicationTests {
    @Autowired
    private Publisher publisher;

    @Test
    void contextLoads() {
        publisher.send();
    }

}
