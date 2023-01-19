package com.cinema.notification.web.mappers;

import com.cinema.clients.notification.models.NotificationDto;
import com.cinema.notification.domain.Notification;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class NotificationMapperDecorator implements NotificationMapper {

    private NotificationMapper notificationMapper;

    @Autowired
    public void setNotificationMapper(NotificationMapper notificationMapper) {
        this.notificationMapper = notificationMapper;
    }


    @Override
    public NotificationDto notificationToNotificationDto(Notification notification) {
        return notificationMapper.notificationToNotificationDto(notification);
    }

    @Override
    public Notification notificationDtoToNotification(NotificationDto notificationDto) {
        return notificationMapper.notificationDtoToNotification(notificationDto);
    }
}
