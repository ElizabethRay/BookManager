package net.proselyte.bookmanager.service;

import net.proselyte.bookmanager.model.Book;

import java.util.List;

/**
 * Created by User on 006 06.01.19.
 */
public interface BookService {
    void addBook(Book book);
    void updateBook(Book book);
    void removeBook(int id);
    Book getBookById(int id);
    List<Book> listBooks();

}
