package com.cinema.customer.web.mappers;


import com.cinema.customer.domain.User;
import com.cinema.customer.web.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class UserMapperDecorator implements UserMapper {

    private UserMapper userMapper;


    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public UserDto userToUserDto(User user) {
        return userMapper.userToUserDto(user);
    }

    @Override
    public User userDtoTouSer(UserDto userDto) {
        return userMapper.userDtoTouSer(userDto);
    }
}
