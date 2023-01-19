package com.cinema.customer.web.mappers;


import com.cinema.customer.domain.User;
import com.cinema.customer.web.model.UserDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper
@DecoratedWith(UserMapperDecorator.class)
public interface UserMapper {

    UserDto userToUserDto(User user);

    User userDtoTouSer(UserDto userDto);
}
