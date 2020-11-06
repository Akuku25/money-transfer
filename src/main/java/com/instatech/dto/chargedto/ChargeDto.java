package com.instatech.dto.chargedto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ChargeDto implements Serializable {
    private static final long SerialVersionUID = 1L;
    private long id;
    private String minAmount;
    private String maxAmount;
    private String withdrawCharge;
    private String toUnRegistered;
    private String toRegistered;
    private String message;
    private boolean status = false;
}
