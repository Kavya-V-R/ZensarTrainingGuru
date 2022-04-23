package com.zensar.olx.masterdata.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olx.masterdata.bean.AdvertisementStatus;

@Repository
public interface AdvertisementStatusDAO extends JpaRepository<AdvertisementStatus, Integer> {

}
