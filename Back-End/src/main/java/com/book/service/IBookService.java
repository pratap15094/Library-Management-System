package com.book.service;

import java.util.List;
import java.util.Optional;

import com.book.entity.Book;

public interface IBookService {

	public Integer saveBook(Book book);

	//Optional<Book> getBook(Integer bookID);

	public List<Book> getAllBook();

	public void deleteBook(Integer bookID);

	public Book updateBook(Book book, Integer bookID);

	public Book updateStatus(Book book, Integer bookID);

}