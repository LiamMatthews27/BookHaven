/*
Author: Engetelo Assistance Mathebane
Student Number: 230227767
*/

package ac.za.mycput.factory;

import org.junit.jupiter.api.*;
import ac.za.mycput.domain.User;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserFactoryTest {

    private final static User user1 = UserFactory.createUser(456,
                                                             "0501171031087",
                                                             "Engetelo",
                                                             "Mathebane");

    private final static User user2 = UserFactory.createUser(314,
                                                             "0408031051089",
                                                             "Catlin",
                                                             "Malan",
                                                             "Cmalangmail.com",
                                                             "Cape town CBD");  // a user with a valid email

    private final static User user3 = UserFactory.createUser(989,
                                                             "9902241131086",
                                                             "Rasheed",
                                                             "Benjamin",
                                                             "Rasheed@gmail.com",
                                                             "Cape Town Foreshore st loop");

    private final static User user4 = UserFactory.createUser(213,
                                                              "03076087",
                                                              "Ginny",
                                                              "Mendusa",
                                                              "Ginny@gmail.com",
                                                             "Freedom Park 23 Junction");  // a user with an invalid ID

    @Test
    @Order(1)
    public void testCreateUser() {
        assertNotNull(user1);
        System.out.println("User 1  " + user1);
    }

    @Test
    @Order(2)
    public void testCreateUserFails() {
        assertNull(user2);
        System.out.println("User 2 failed because the email its wrong.");
    }

    @Test
    @Order(3)
    public void testCreateUserWithAllAttributes() {
        assertNotNull(user3);
        System.out.println("User 3 with all Attributes"+ user3);
    }

    @Test
    @Order(4)
    public void testCreateUserMissingID() {
        assertNull(user4);
        System.out.println("User 4 failed because ID number its not 13 digits.");
    }

    @Test
    @Disabled
    public void testNotImplemented() {

    }
}
