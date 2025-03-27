package ac.za.mycput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import ac.za.mycput.domain.Library;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LibraryFactoryTest {

    Library l1 = LibraryFactory.createLibrary("1245","Central Library", "library@central.com",
            "123 Main St", "+27176543210");
    private static Library l2 = LibraryFactory.createLibrary("123456","Tech Library", "info@techlibrary.com",
            "456 Tech Park", "+27176543210");
    private static Library l3 = LibraryFactory.createLibrary("1245","My library", "invalid@library.com",
            "789 Unknown St", "7654321098");

    @Test
    @Order(1)
    public void testCreateLibrary() {
        assertNotNull(l1);
        System.out.println(l1);
    }

    @Test
    @Order(2)
    public void testCreateLibraryWithAllAttributes() {
        assertNotNull(l2);
        System.out.println(l2.toString());
    }

    @Test
    @Order(3)
    public void testCreateLibraryThatWillFail() {
        assertNull(l3); // Should fail due to an empty library name
        System.out.println("Library creation failed as expected.");
    }
}
