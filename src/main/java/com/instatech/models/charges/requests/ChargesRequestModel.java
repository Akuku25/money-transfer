package com.instatech.models.charges.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChargesRequestModel {
    private String minAmount;
    private String maxAmount;
    private String withdrawCharge;
    private String toUnRegistered;
    private String toRegistered;
}
