package com.cinema.customer.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class UserDto extends BaseItem{

    @Builder
    public UserDto(Long id,
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
