package com.cinema.notification.web.mappers;

import com.cinema.clients.notification.models.NotificationDto;
import com.cinema.notification.domain.Notification;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper
@DecoratedWith(NotificationMapperDecorator.class)
public interface NotificationMapper {

    NotificationDto notificationToNotificationDto(Notification notification);

    Notification notificationDtoToNotification(NotificationDto notificationDto);
}
