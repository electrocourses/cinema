package com.cinema.notification.rabbitmq;


import com.cinema.clients.notification.models.NotificationDto;
import com.cinema.notification.services.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationCustomer {
    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer(NotificationDto notificationDto) {
        log.info("Consumed {} from queue", notificationDto);
        notificationService.sendNotification(notificationDto);
    }
}
