package com.cinema.amqp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class RabbitMqMessageProducer {

    private final AmqpTemplate amqpTemplate;

    public void publish(Object payload, String exchange, String routingKeys) {
        log.info("Publishing to {} exchange using routing key {}. Payload: {}", exchange, routingKeys, payload);
            amqpTemplate.convertAndSend(exchange, routingKeys, payload);
        log.info("Published to {} exchange using routing key {}. Payload: {}", exchange, routingKeys, payload);

    }
}
