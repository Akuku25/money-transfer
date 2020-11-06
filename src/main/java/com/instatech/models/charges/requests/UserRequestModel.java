package com.instatech.models.charges.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestModel {
    private String idNumber;
    private String phoneNumber;
    private String password;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private boolean registered;
}
