package com.aos.mywebapp.service;

import com.aos.mywebapp.domain.Province;
import com.aos.mywebapp.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {
    @Autowired
    ProvinceRepository  repo;

    public List<Province> listAllProvince(){
        return  (List<Province>) repo.findAll();

    }

    public void save(Province province) {
        repo.save(province);
    }
}
