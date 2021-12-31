package com.aos.registrationapp.repository;


import com.aos.registrationapp.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    public long  countById(Integer  id);

}
