package com.aos.mywebapp.service;

import com.aos.mywebapp.domain.Applicant;
import com.aos.mywebapp.repository.ApplicantRepository;
import com.aos.mywebapp.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {
    @Autowired private ApplicantRepository repo;
    @Autowired private ProvinceRepository provinceRepo;

    public void save(Applicant applicant){
        repo.save(applicant);
    }

    public List<Applicant> listAll() {
        return (List<Applicant>) repo.findAll();
    }
}
