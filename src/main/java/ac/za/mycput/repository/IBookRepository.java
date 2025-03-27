/*
IBookRepository.java
Author: Caitlin Malan
Student Number: 230426271
Date: 24 March 2025
 */

package ac.za.mycput.repository;

import ac.za.mycput.domain.Book;
import java.util.List;

public interface IBookRepository extends IRepository<Book, Integer>{

    List<Book> getAll();
}
