package com.leekin.rabbitmqdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @description:
 * @date: 2020/8/24 17:35
 * @author: QING LI
 * @copyright: 2020 cheworld.com Inc. All rights reserved. 版权所有:
 *             深圳市万普合信科技有限公司（91440300MA5FUB0P88） 注意: 仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
