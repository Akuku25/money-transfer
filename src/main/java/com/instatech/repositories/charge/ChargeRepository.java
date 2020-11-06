package com.instatech.repositories.charge;

import com.instatech.entities.charge.ChargeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargeRepository extends JpaRepository<ChargeEntity, Long> {
}
