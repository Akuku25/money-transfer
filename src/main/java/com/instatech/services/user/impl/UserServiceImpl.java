package com.instatech.services.user.impl;

import com.instatech.dto.userdto.UserDto;
import com.instatech.entities.user.UserEntity;
import com.instatech.repositories.user.UserRepository;
import com.instatech.services.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {
        UserDto returnValue = new UserDto();

        try{
            UserEntity userEntity = new UserEntity();
            BeanUtils.copyProperties(user, userEntity);
            UserEntity createdUser = userRepository.save(userEntity);

            BeanUtils.copyProperties(createdUser, returnValue);
            if(createdUser != null) {
                returnValue.setStatus(true);
                returnValue.setMessage("Success");
            }
        }catch(Exception ex){

        }
        return returnValue;
    }
}
