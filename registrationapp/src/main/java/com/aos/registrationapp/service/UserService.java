package com.aos.registrationapp.service;

import com.aos.registrationapp.domain.User;
import com.aos.registrationapp.repository.UserRepository;
import com.aos.registrationapp.userNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository repo;

    public List<User> listAll(){

       return (List<User>) repo.findAll();
    }

    public void save(User user) {

        repo.save(user);
    }
     public User get (Integer id) throws userNotFoundException {

        Optional<User> result = repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }
      throw  new userNotFoundException("Could not found user of such id " +id);
    }
    public void deleteById(Integer id) throws  userNotFoundException{
        Long count  = repo.countById(id);
        if (count ==null || count == 0){
            throw new userNotFoundException("Could not find user with such id:" + id);
        }
        repo.deleteById(id);
    }
}

