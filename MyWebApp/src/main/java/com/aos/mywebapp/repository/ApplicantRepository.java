package com.aos.mywebapp.repository;

import com.aos.mywebapp.domain.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantRepository extends CrudRepository<Applicant, String> {


}
