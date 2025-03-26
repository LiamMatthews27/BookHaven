/*
Author: Caitlin Malan
Student Number: 230426271
 */

package ac.za.mycput.domain;

public class Book {
    private int bookISBN;
    private int bookYear;
    private String bookTitle;
    private double bookPrice;
    private String bookGenre;
    private String bookPublisherName;
    private String bookAuthorName;
//    private Library libraryInfromation;

    private Book(Builder builder) {
        this.bookYear = builder.bookYear;
        this.bookTitle = builder.bookTitle;
        this.bookPrice = builder.bookPrice;
        this.bookGenre = builder.bookGenre;
        this.bookPublisherName = builder.bookPublisherName;
        this.bookAuthorName = builder.bookAuthorName;
    }

    public int getBookISBN() {
        return bookISBN;
    }

    public int getBookYear() {
        return bookYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public String getBookPublisherName() {
        return bookPublisherName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookISBN=" + bookISBN +
                ", bookYear=" + bookYear +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookGenre='" + bookGenre + '\'' +
                ", bookPublisherName='" + bookPublisherName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                '}';
    }

    public static class Builder {
        private int bookISBN;
        private int bookYear;
        private String bookTitle;
        private double bookPrice;
        private String bookGenre;
        private String bookPublisherName;
        private String bookAuthorName;

        public Builder setBookISBN(int bookISBN) {
            this.bookISBN = bookISBN;
            return this;
        }

        public Builder setBookYear(int bookYear) {
            this.bookYear = bookYear;
            return this;
        }

        public Builder setBookTitle(String bookTitle){
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder setBookPrice(double bookPrice) {
            this.bookPrice = bookPrice;
            return this;
        }

        public Builder setBookGenre(String bookGenre) {
            this.bookGenre = bookGenre;
            return this;
        }

        public Builder setBookPublisherName(String bookPublisherName) {
            this.bookPublisherName = bookPublisherName;
            return this;
        }

        public Builder setBookAuthorName(String bookAuthorName){
            this.bookAuthorName = bookAuthorName;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
