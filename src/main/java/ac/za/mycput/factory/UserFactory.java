
/*
Author: Engetelo Assistance Mathebane
Student Number: 230227767
*/
package ac.za.mycput.factory;

import ac.za.mycput.domain.User;
import ac.za.mycput.until.Helper;
import java.time.LocalDate;

public class UserFactory {

    public static User createUser(int userId,
                                  String userIdentityNo,
                                  String userName,
                                  String userSurname) {

        if (Helper.isNullOrEmpty(userIdentityNo) ||
                Helper.isNullOrEmpty(userName) ||
                Helper.isNullOrEmpty(userSurname ))
            return null;

        if( Helper.isNullOrInvalid(userId)

        )
            return null;
        if (!Helper.validateID(userIdentityNo))
            return null;

        return new User.Builder()
                .setUserId(userId)
                .setUserIdentityNo(userIdentityNo)
                .setUserName(userName)
                .setUserSurname(userSurname)
                .build();
    }

    public static User createUser(int userId,
                                   String userIdentityNo,
                                  String userName,
                                  String userSurname,
                                  String userEmail,
                                  String userAddress)
    {
        if (
                Helper.isNullOrEmpty(userIdentityNo) ||
                Helper.isNullOrEmpty(userName) ||
                Helper.isNullOrEmpty(userSurname) ||
                Helper.isNullOrEmpty(userAddress) ||
                Helper.isNullOrEmpty(userEmail))
            return null;

        if(     Helper.isNullOrInvalid(userId)

        )
            return null;

        if (!Helper.isValidEmail(userEmail))
            return null;

        if (!Helper.validateID(userIdentityNo))
            return null;

        LocalDate dateOfBirth = Helper.getDateOfBirth(userIdentityNo);

        return new User.Builder()
                .setUserId(userId)
                .setUserIdentityNo(userIdentityNo)
                .setUserName(userName)
                .setUserSurname(userSurname)
                .setUserAddress(userAddress)
                .setUserEmail(userEmail)
                .setDateOfBirth(dateOfBirth)
                .build();
    }
}
