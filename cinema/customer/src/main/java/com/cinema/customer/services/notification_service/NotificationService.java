package com.cinema.customer.services.notification_service;


import com.cinema.customer.web.model.UserDto;

public interface NotificationService {
    void sendNotification(UserDto userDto);
}
