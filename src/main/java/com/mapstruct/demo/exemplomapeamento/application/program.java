package com.mapstruct.demo.application;

import com.mapstruct.demo.dto.UserDTO;
import com.mapstruct.demo.entities.User;
import com.mapstruct.demo.mapper.UserMapper;

public class program {

    public static void main(String[] args) {

        User user = new User(1L, "Jayanne Mirelly", "jay@gmail.com");

        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);

        System.out.println("Original User: " + user);
        System.out.println("Mapped UserDTO: " + userDTO);

        User convertedUser = UserMapper.INSTANCE.userDTOToUser(userDTO);
        System.out.println("Converted back to User: " + convertedUser);
    }
}
