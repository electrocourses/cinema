package com.cinema.customer.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;




@Data
@Entity
@NoArgsConstructor
@Table(name = "user_table")
public class User extends BaseEntity {

    @Builder
    public User(Long id,
                Timestamp lastUpdate,
                String name,
                String password,
                String email) {
        super(id, lastUpdate);
        this.name = name;
        this.password = password;
        this.email = email;
    }
    private String name;
    private String password;
    private String email;

}
