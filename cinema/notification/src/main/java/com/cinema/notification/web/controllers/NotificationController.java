package com.cinema.notification.web.controllers;

import com.cinema.clients.notification.models.NotificationDto;
import com.cinema.notification.services.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("src/main/com.cinema.clients/notification")
    public void sentNotification(@RequestBody NotificationDto notificationDto) {
            notificationService.sendNotification(notificationDto);
    }
}
