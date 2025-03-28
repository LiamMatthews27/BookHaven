package ac.za.mycput.factory;

import ac.za.mycput.util.Helper;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookReservationFactoryTest {
    @Test
    void testGetReservationDates_ValidId() {
        // Test case 1: Valid date
//        String validId1 = "231027";
//        LocalDate expectedDate1 = LocalDate.of(2023, 10, 27);
//        LocalDate actualDate1 = Helper.getReservationDates(validId1);
//        assertEquals(expectedDate1, actualDate1);

    }

//    @Test
//    void testGetReservationDates_InvalidId() {
//        // Test case 1: Null ID - Should throw IllegalArgumentException
//        assertThrows(StringIndexOutOfBoundsException.class, () -> {  // Changed to StringIndexOutOfBoundsException
//            Helper.getReservationDates(null);
//        });
//
//        // Test case 2: Empty ID - Should throw IllegalArgumentException
//        assertThrows(StringIndexOutOfBoundsException.class, () -> { // Changed to StringIndexOutOfBoundsException
//            Helper.getReservationDates("");
//        });
//
//        // Test case 3: ID too short - Should throw IllegalArgumentException
//        assertThrows(StringIndexOutOfBoundsException.class, () -> {  // Changed to StringIndexOutOfBoundsException
//            Helper.getReservationDates("12345");
//        });
//
//        // Test case 4: ID too long - Should throw IllegalArgumentException
//        assertThrows(StringIndexOutOfBoundsException.class, () -> { // Changed to StringIndexOutOfBoundsException
//            Helper.getReservationDates("1234567");
//        });
//
//        // Test case 5: Invalid month
//        assertThrows(IllegalArgumentException.class, () -> {
//            Helper.getReservationDates("231301"); // Month 13
//        });
//
//        // Test case 6: Invalid day
//        assertThrows(IllegalArgumentException.class, () -> {
//            Helper.getReservationDates("230631"); // June has 30 days
//        });
//
//        // Test case 7: Non-numeric characters
//        assertThrows(NumberFormatException.class, () -> {
//            Helper.getReservationDates("230a01");
//        });
//    }

    @Test
    public void testGetReservationDates_SpecificValidId() {
        // Test case with a specific valid ID and assertion
        String specificValidId = "240520"; // Example: 20th May 2024
        LocalDate expectedDate = LocalDate.of(2024, 5, 20);
        LocalDate actualDate = Helper.getReservationDates(specificValidId);
        assertEquals(expectedDate, actualDate, "Test with ID 240520 failed");
        System.out.println("Test passed for ID: " + specificValidId + ", Date: " + actualDate);
    }


}
