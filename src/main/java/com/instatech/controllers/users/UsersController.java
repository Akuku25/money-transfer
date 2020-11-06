package com.instatech.controllers.users;

import com.instatech.dto.userdto.UserDto;
import com.instatech.models.charges.requests.UserRequestModel;
import com.instatech.models.charges.responses.UserResponse;
import com.instatech.services.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersController {
    @Autowired
    UserService userService;

    @PostMapping
    public UserResponse createUSer(@RequestBody UserRequestModel userDetails) {
        UserResponse returnValue = new UserResponse();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);
        UserDto createdUser = userService.createUser(userDto);

        BeanUtils.copyProperties(createdUser, returnValue);
        return returnValue;
    }
}
