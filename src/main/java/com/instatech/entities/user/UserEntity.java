package com.instatech.entities.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
public class UserEntity implements Serializable {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true, length = 30)
    private String idNumber;

    @Column(nullable = false, unique = true, length = 30)
    private String phoneNumber;

    @Column(nullable = false, unique = true, length = 30)
    private String password;

    @Column(nullable = false, unique = true, length = 50)
    private String userName;

    @Column(length = 30)
    private String firstName;

    @Column(length = 30)
    private String lastName;

    @Column(nullable = false, unique = true, length = 30)
    private String email;

    @Column(nullable = false)
    private boolean registered = false;
}
