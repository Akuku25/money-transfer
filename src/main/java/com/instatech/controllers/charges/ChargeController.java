package com.instatech.controllers.charges;

import com.instatech.dto.chargedto.ChargeDto;
import com.instatech.models.charges.requests.ChargesRequestModel;
import com.instatech.models.charges.responses.ChargeResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.instatech.services.charge.ChargeService;

@RestController
@RequestMapping("charges")
public class ChargeController {
    @Autowired
    ChargeService chargeService;

    @PostMapping
    public ChargeResponse createCharge(@RequestBody ChargesRequestModel chargeDetails){
        ChargeResponse returnValue = new ChargeResponse();

        ChargeDto chargeDto = new ChargeDto();
        BeanUtils.copyProperties(chargeDetails, chargeDto);

        ChargeDto createdCharge = chargeService.createCharge(chargeDto);
        BeanUtils.copyProperties(createdCharge, returnValue);
        return returnValue;
    }
}
