package com.aos.registrationapp.service;


import com.aos.registrationapp.domain.Province;
import com.aos.registrationapp.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {
    @Autowired
    ProvinceRepository repo;

    public List<Province> listAllProvince(){
        return  (List<Province>) repo.findAll();

    }

    public void save(Province province) {
        repo.save(province);
    }
}
