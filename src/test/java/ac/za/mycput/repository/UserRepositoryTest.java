/*
Author: Engetelo Assistance Mathebane
Student Number: 230227767
*/


package ac.za.mycput.repository;

import ac.za.mycput.domain.Library;
import ac.za.mycput.domain.Loan;
import ac.za.mycput.domain.User;
import ac.za.mycput.factory.UserFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class UserRepositoryTest {

    private static IUserRepository repository = UserRepository.getRepository();

    private User user = UserFactory.createUser(789,
                                               "0309242331087",
                                               "Moses",
                                               "Makungo",
                                               "Makungom@gmail.com",
                                               "Newlands peak Apartment");


    @Test
    void a_create() {
        User createUser = repository.create(user);
        assertNotNull(createUser);
        System.out.println("new user created" + createUser);
    }

    @Test
    void b_read() {
        User readUser = repository.read(user.getUserId());
        assertNotNull(readUser);
        System.out.println(readUser.toString());
    }

    @Test
    void c_update() {
        User newUser = new User.Builder().copy(user).
                setUserName("Fhumulani").
                setUserEmail("fmakungo@gmail.com").build();
        User updated = repository.update(newUser);
        assertNotNull(updated);
        System.out.println("User updated to " +newUser);
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(user.getUserId()));
        System.out.println("User has been deleted");
    }

   @Test
    void d_getAll() {
        System.out.println(repository.getAll());
   }

}


