package ac.za.mycput.repository;

import ac.za.mycput.domain.Library;
import ac.za.mycput.factory.LibraryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class LibraryRepositoryTest {

    private static ILibraryRepository repository = LibraryRepository.getRepository();
    private Library library = LibraryFactory.createLibrary("cputlibrary120", "IThala Lencwadi", "cputlib@gmail.com", "Hanover St, D6 Campus, Cape Town, 8000", "01");;


    @Test
    void create() {
        Library create = repository.create(library);
        System.out.println(create);
    }

    @Test
    void read() {
        Library create = repository.create(library);
        Library read = repository.read(create.getLibraryID());
        System.out.println("Id: " + library.getLibraryID());
        assertNotNull(read);
    }

    @Test
    void update() {
        Library updateLibrary = new Library.Builder().copy(library).setLibraryEmail("cput@gmail.com").build();
        Library createLibrary = repository.create(updateLibrary);
        Library updatedLibrary = repository.update(createLibrary);
        assertNotNull(updatedLibrary);
        System.out.println("New Library: " + updatedLibrary);
    }

    @Test
    void delete() {
        Library create = repository.create(library);
        assertTrue(repository.delete(create.getLibraryID()));
    }

    @Test
    void getAll() {
        Library create = repository.create(library);
        List<Library> libraryList = repository.getAll(create);
        assertNotNull(libraryList);
        System.out.println(libraryList);
    }
}