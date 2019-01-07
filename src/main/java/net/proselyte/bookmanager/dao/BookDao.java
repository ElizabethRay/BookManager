package net.proselyte.bookmanager.dao;

import net.proselyte.bookmanager.model.Book;

import java.util.List;

/**
 * Created by User on 006 06.01.19.
 */
public interface BookDao {
    void addBook(Book book);
    void updateBook(Book book);
    void removeBook(int id);
    Book getBookById(int id);
    List<Book> listBooks();
}
