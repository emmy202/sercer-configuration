package com.aos.mywebapp;


import com.aos.mywebapp.domain.User;
import com.aos.mywebapp.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase( replace =AutoConfigureTestDatabase.Replace.NONE)
@Rollback( false)
public class UserRepositoryTest {
    @Autowired private UserRepository repo;
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


}
