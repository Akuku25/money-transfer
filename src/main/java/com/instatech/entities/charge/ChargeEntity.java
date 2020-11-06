package com.instatech.entities.charge;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name="tbl_charges")
@Getter
@Setter
public class ChargeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true, length = 30)
    private String minAmount;

    @Column(nullable = false, unique = true, length = 30)
    private String maxAmount;

    @Column(nullable = false, unique = true, length = 30)
    private String withdrawCharge;

    @Column(nullable = false, unique = true, length = 30)
    private String toUnRegistered;

    @Column(nullable = false,  unique = true, length = 30)
    private String toRegistered;
}
