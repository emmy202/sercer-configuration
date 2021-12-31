package com.aos.mywebapp.service;

import com.aos.mywebapp.domain.District;
import com.aos.mywebapp.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    public void save(District district) {
        districtRepository.save(district);
    }

    public List listAllDistrict() {
        return  (List<District>) districtRepository.findAll();
    }
    public Optional<District> findDistById(String provId){
        return  districtRepository.findById(provId);
    }

}
