package com.book.service;

import java.util.Collection;

import com.book.pojo.Book;
import com.book.pojo.Cart;


public interface BookService {

	Collection<Book> viewAllBooks();

	void delFrmCart(int Id);

	void addBookCart(int id);

	Collection<Cart> viewCart();
	
	int getTotalQuantity();
	
	double getTotalPrice();
}
