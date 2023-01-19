package com.cinema.notification.services;


import com.cinema.clients.notification.models.NotificationDto;
import com.cinema.notification.repositories.NotificationRepository;
import com.cinema.notification.web.mappers.NotificationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationMapper notificationMapper;

    public void sendNotification(NotificationDto notificationDto) {
        notificationRepository.save(notificationMapper.notificationDtoToNotification(notificationDto));
    }
}
