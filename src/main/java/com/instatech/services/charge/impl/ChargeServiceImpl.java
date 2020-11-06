package com.instatech.services.charge.impl;

import com.instatech.dto.chargedto.ChargeDto;
import com.instatech.entities.charge.ChargeEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.instatech.repositories.charge.ChargeRepository;
import com.instatech.services.charge.ChargeService;

@Service
public class ChargeServiceImpl implements ChargeService {

    @Autowired
    ChargeRepository chargeRepository;

    @Override
    public ChargeDto createCharge(ChargeDto charge) {
        ChargeDto returnValue = new ChargeDto();
        try {
            ChargeEntity chargeEntity = new ChargeEntity();
            BeanUtils.copyProperties(charge, chargeEntity);

            ChargeEntity createdCharge = chargeRepository.save(chargeEntity);

            BeanUtils.copyProperties(createdCharge, returnValue);
            if (createdCharge != null) {
                returnValue.setStatus(true);
                returnValue.setMessage("success");
            }

        } catch (Exception ex) {
        }
        return returnValue;
    }
}
