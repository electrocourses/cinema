package com.cinema.clients.notification.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class NotificationDto extends BaseItem {

    @Builder
    public NotificationDto(Long id,
                           Timestamp lastUpdate,
                           Long toUserId,
                           String toUserEmail,
                           String sender,
                           String message) {
        super(id, lastUpdate);
        this.toUserId = toUserId;
        this.toUserEmail = toUserEmail;
        this.sender = sender;
        this.message = message;
    }

    private Long toUserId;
    private String toUserEmail;
    private String sender;
    private String message;
}
