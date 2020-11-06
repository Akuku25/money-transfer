package com.instatech.dto.userdto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class UserDto implements Serializable {

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private static final long serialVersionUID = 1L;
    private long id;
    private String idNumber;
    private String phoneNumber;
    private String password;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private boolean registered;
    private String message;
    private boolean status;
}
