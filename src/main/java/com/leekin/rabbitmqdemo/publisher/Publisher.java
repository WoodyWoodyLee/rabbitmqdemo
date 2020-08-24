package com.leekin.rabbitmqdemo.publisher;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description: 发送方
 * @date: 2020/8/24 17:38
 * @author: QING LI
 * @copyright: 2020 cheworld.com Inc. All rights reserved. 版权所有:
 *             深圳市万普合信科技有限公司（91440300MA5FUB0P88） 注意: 仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
@Component
public class Publisher {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello" + new Date();
        System.out.println("Publisher: " + context );
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
