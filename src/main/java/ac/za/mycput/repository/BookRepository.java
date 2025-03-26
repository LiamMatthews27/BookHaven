package ac.za.mycput.repository;

import ac.za.mycput.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository{

    private static IBookRepository repository = null;

    private List<Book> bookList;

    private BookRepository(){
        bookList = new ArrayList<Book>();
    }

    public static IBookRepository getRepository(){
        if (repository ==null){
            repository = new BookRepository();
        }
        return repository;
    }

    @Override
    public Book create(Book book) {
        boolean success = bookList.add(book);
        if(success){
            return book;
        }
        return null;
    }

    @Override
    public Book read(Integer id) {
        for (Book book : bookList) {
            if(book.getBookISBN() == id)
                return book;
        }
        return null;
    }

    @Override
    public Book update(Book book) {
        int id = book.getBookISBN();
        Book oldBookValue = read(id);
        if (oldBookValue == null)
            return null;

        boolean success = delete(id);
            if (success) {
                if (bookList.add(book))
                    return book;
            }
            return null;
    }

    @Override
    public boolean delete(Integer id) {
        Book bookToBeDeleted = read(id);
        if (bookToBeDeleted == null)
            return false;
        return (bookList.remove(bookToBeDeleted));
    }

    @Override
    public List<Book> getAll() {
        return bookList;
    }
}
