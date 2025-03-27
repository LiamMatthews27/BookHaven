/*
BookRepository.java
Book repository test class
Author: Caitlin Malan
Student Number: 230426271
Date: 26 March 2025
 */

package ac.za.mycput.repository;

import ac.za.mycput.domain.Book;
import ac.za.mycput.factory.BookFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BookRepositoryTest {
    private static IBookRepository repository = BookRepository.getRepository();

    private Book book = BookFactory.createBook(
            1,
            2015,
            "The Tarot",
            80.99,
            "Horror",
            "The Penguin",
            "Emily Nickle");

    @Test
    void a_create() {
        Book createdBook = repository.create(book);
        assertNotNull(createdBook);
        System.out.println(createdBook.toString());
    }

    @Test
    void b_read() {
        Book read = repository.read(book.getBookISBN());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Book updatedNewBook = new Book.Builder().copy(book).setBookTitle("The Raging Tarot").build();
        Book updated = repository.update(updatedNewBook);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(book.getBookISBN()));
        System.out.println("\n"+"Book has been successfully deleted!:)");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}