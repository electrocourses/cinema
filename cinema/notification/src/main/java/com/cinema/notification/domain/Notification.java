package com.cinema.notification.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "notification")
public class Notification extends BaseEntity{

    @Builder
    public Notification(Long id, Timestamp lastUpdate, Long toUserId, String toUserEmail, String sender, String message) {
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
