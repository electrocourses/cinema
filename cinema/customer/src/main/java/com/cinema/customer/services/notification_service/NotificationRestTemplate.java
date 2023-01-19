package com.cinema.customer.services.notification_service;

import com.cinema.clients.notification.models.NotificationDto;
import com.cinema.clients.notification.notification.NotificationClient;
import com.cinema.customer.web.model.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationRestTemplate implements NotificationService {
//    private final NotificationClient notificationClient;

    private final RestTemplate restTemplate;

    @Override
    public void sendNotification(UserDto userDto) {
//        NotificationDto notificationToSave = NotificationDto.builder()
//                .message("User with ID: " + userDto.getId() + " was registered")
//                .sender(userDto.getName())
//                .toUserEmail(userDto.getEmail())
//                .build();
//        log.info("User been requested notification with user ID: " + userDto.getId());
//        notificationClient.sentNotification(notificationToSave);
    }
}
