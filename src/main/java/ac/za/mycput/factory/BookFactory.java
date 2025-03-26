/*
Author: Caitlin Malan
Student Number: 230426271
 */
package ac.za.mycput.factory;

import ac.za.mycput.domain.Book;
import ac.za.mycput.until.Helper;

public class BookFactory {

    public static Book createBook(
            int bookISBN,
            int bookYear,
            String bookTitle,
            double bookPrice,
            String bookGenre,
            String bookPublisherName,
            String bookAuthorName){

        if(     Helper.isNullOrEmpty(bookTitle) ||
                Helper.isNullOrEmpty(bookGenre) ||
                Helper.isNullOrEmpty(bookPublisherName) ||
                Helper.isNullOrEmpty(bookAuthorName)
        )
            return null;

        if(     Helper.isNullOrInvalid(bookISBN) ||
                Helper.isNullOrInvalid(bookYear)
        )
            return null;

        if( Helper.isNullOrInvalid(bookPrice)
        )
            return null;

        return new Book.Builder()
                .setBookISBN(bookISBN)
                .setBookYear(bookYear)
                .setBookTitle(bookTitle)
                .setBookPrice(bookPrice)
                .setBookGenre(bookGenre)
                .setBookPublisherName(bookPublisherName)
                .setBookAuthorName(bookAuthorName)
                .build();

    }
}
