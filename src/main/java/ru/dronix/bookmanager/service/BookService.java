package ru.dronix.bookmanager.service;

import ru.dronix.bookmanager.model.Book;

import java.util.List;

/**
 * Created by ADMIN on 04.12.2016.
 */
public interface BookService {

    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public Book getBookById(int id);
    public List<Book> listBooks();

}
