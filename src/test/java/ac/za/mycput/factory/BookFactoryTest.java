package ac.za.mycput.factory;

import ac.za.mycput.domain.Book;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookFactoryTest {

    private static Book book1 = BookFactory.createBook(
            1,
            2013,
            "The Willow Man",
            23.99,
            "Fiction",
            "The Penguin",
            "Max Forth");

    private static Book book2 = BookFactory.createBook(
            2,
            2024,
            "Bright Side of You",
            23.99,
            "Romance",
            "HarperCollins",
            "Lily Seaworth");

    private static Book book3 = BookFactory.createBook(
            3,
            2005,
            "January to December",
            23.99,
            "Sci-fiction",
            "HarperCollins",
            "Peter Underwave");

    @Test
    public void testCreateBook() {
        assertNotNull(book1);
        System.out.println(book1.toString());

    }

    @Test
    public void testCreateBookWithAllAtrributes() {
        assertNotNull(book2);
        System.out.println(book2.toString());
    }

    @Test
    public void testCreateBookThatFails(){
//        fail();

        assertNotNull(book3);
        System.out.println(book3.toString());
    }

//    @Test
//    @Disabled
//    public void testNotImplementedYet(){
//        // Todo
//    }
}