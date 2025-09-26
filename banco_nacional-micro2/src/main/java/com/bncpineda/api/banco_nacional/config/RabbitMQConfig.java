package com.bncpineda.api.banco_nacional.config;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author Marco Pineda
 * @date 9/25/2025
 */

@Configuration
@EnableRabbit
public class RabbitMQConfig
{
    @RabbitListener(queues = "cuentaQueue")
    public void listen(String message) {
        System.out.println(message);
    }
}
