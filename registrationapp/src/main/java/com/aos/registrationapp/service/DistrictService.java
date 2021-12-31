package com.aos.registrationapp.service;

import com.aos.registrationapp.domain.District;
import com.aos.registrationapp.repository.DistrictRepository;
import com.aos.registrationapp.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;
    @Autowired
    private ProvinceRepository provinceRepository;
    public void save(District district) {
        districtRepository.save(district);
    }

    public List listAllDistrict() {
        return  (List<District>) districtRepository.findAll();
    }

        public List findByProvinceId(String accNo){
           List<District>  districtByProvince = new ArrayList<>();
          List<District> ls = (List<District>) districtRepository.findAll();
            for(District d :ls){
         if(d.getProvince().getProvId().equals(accNo)){
           districtByProvince.add(d);
         }
        }

            return null;
        }

}
