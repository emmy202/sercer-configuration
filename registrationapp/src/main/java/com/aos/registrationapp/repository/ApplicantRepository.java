package com.aos.registrationapp.repository;


import com.aos.registrationapp.domain.Applicant;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantRepository extends CrudRepository<Applicant, String> {


}
