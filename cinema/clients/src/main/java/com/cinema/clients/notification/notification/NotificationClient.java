package com.cinema.clients.notification.notification;

import com.cinema.clients.notification.models.NotificationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification", url = "${clients.notification.url}")
public interface NotificationClient {
    @PostMapping("/api/v1/notification")
    void sentNotification(@RequestBody NotificationDto notificationDto);
}
