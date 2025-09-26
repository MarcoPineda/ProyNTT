package com.test.api.banco_nacional.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Marco Pineda
 * @date 9/24/2025
 */

@Configuration
public class RabbitMQConfig
{
    @Bean
    public Queue queue() {
        return new Queue("cuentaQueue", false);
    }
}
