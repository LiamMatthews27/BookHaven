package ac.za.mycput.factory;

import ac.za.mycput.domain.Library;
import ac.za.mycput.util.Helper;

public class LibraryFactory {

    public static Library createLibrary(String libraryId, String libraryName, String libraryEmail, String libraryAddress,String libraryNumber) {

        if(Helper.isNullOrEmpty(libraryId) || Helper.isNullOrEmpty(libraryName) || !Helper.isValidEmail(libraryEmail) || Helper.isNullOrEmpty(libraryAddress) || Helper.isNullOrEmpty(libraryNumber)) {
            return null;
        }

        return new Library.Builder().setLibraryID(libraryId)
                .setLibraryName(libraryName)
                .setLibraryEmail(libraryEmail)
                .setLibraryAddress(libraryAddress)
                .setLibraryPhone(libraryNumber)
                .build();
    }
}
