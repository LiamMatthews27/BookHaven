package ac.za.mycput.factory;

import ac.za.mycput.domain.User;
import ac.za.mycput.util.Helper;
import java.time.LocalDate;

/*Engetelo Assistance Mathebane
230227767
 */
public class UserFactory {

    public static User createUser(String userId, String userName,String userSurname, String userDateOfBirth
            ,String userEmail, String userAddress) {

        if(Helper.isNullOrEmpty(userId) || Helper.isNullOrEmpty(userName) || Helper.isNullOrEmpty(userSurname) || Helper.isNullOrEmpty(userDateOfBirth) ||
                Helper.isNullOrEmpty(userAddress) || Helper.isNullOrEmpty(userEmail))
            return null;

        if(Helper.isValidEmail(userEmail))
            return null;

        LocalDate dateOfBirth = Helper.getDateOfBirth(userId);

        return new User.Builder()
                .setUserId(Integer.parseInt(userId))
                .setUserName(userName)
                .setUserSurname(userSurname)
                .setUserAddress(userAddress)
                .setUserDateOfBirth(LocalDate.parse(userDateOfBirth))
                .setUserEmail(userEmail)
                .build();

    }

}
