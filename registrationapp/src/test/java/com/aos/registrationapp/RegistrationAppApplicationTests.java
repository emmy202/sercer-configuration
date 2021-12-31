package com.aos.registrationapp;

import com.aos.registrationapp.domain.User;
import com.aos.registrationapp.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase( replace =AutoConfigureTestDatabase.Replace.NONE)
@Rollback( false)
public class RegistrationAppApplicationTests {
    @Autowired
    private UserRepository repo;
    @Test
    public void testAddNew(){

        User user = new User();
        user.setEmail("emmanuel.hitimana@aos12.rw");
        user.setPassword("kamana1234");
        user.setLastName("Emmanuel");
        user.setFirstName("Hitimana");
        User savedUser = repo.save(user);
        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }
    @Test
    public void testListAll(){

        Iterable<User> users = repo.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);
        for(User u : users){

            System.out.println(u);
        }
    }
    @Test
    public void testUpdate(){

//        Integer userId=1;
//        Optional<User> optionalUser = repo.findById(userId);
//       User user = optionalUser.get();
//       user.setPassword("hello2020");
//       repo.save(user);
//       User userUpdate = repo.findById(userId).get();
//       Assertions.assertThat(userUpdate.getPassword()).isEqualTo("hello2020");
    }
    @Test
    public void getUpdate(){
//        Integer userId=10;
//        Optional<User> optionalUser = repo.findById(userId);
//        Assertions.assertThat(optionalUser).isPresent();
//        System.out.println(optionalUser.get());


    }
    @Test
    public void deleteTest(){
//        Integer userId=10;
//         repo.deleteById(userId);
//        Optional<User> optionalUser = repo.findById(userId);
//        Assertions.assertThat(optionalUser).isNotPresent();
    }


}
