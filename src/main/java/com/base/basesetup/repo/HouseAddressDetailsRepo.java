package com.base.basesetup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.basesetup.entity.HouseAddressDetailsVO;

@Repository
public interface HouseAddressDetailsRepo extends JpaRepository<HouseAddressDetailsVO, Long>{

}