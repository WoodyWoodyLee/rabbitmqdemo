package com.leekin.rabbitmqdemo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @date: 2020/8/24 17:41
 * @author: QING LI
 * @copyright: 2020 cheworld.com Inc. All rights reserved. 版权所有:
 *             深圳市万普合信科技有限公司（91440300MA5FUB0P88） 注意: 仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@Component
@RabbitListener(queues = "hello")
public class Consumer {
    @RabbitHandler
    public void process(String context) {
        System.out.println("Consumer: " + context);
    }

}
