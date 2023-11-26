package com.bilgeadam.config.redis.rabbitmq;



import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {



    @Value("${rabbitmq-queue-register}")
    private String queueNameRegister;

    @Bean
    public Queue registerQueue(){
        return new Queue(queueNameRegister);
    }

}
