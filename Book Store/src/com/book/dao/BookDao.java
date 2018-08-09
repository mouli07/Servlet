package com.book.dao;

import com.book.pojo.Book;
import com.book.pojo.Cart;

import java.util.Collection;

public interface BookDao {
	
	Collection<Book> viewAllBooks();

	void addBookCart(int id);

	Collection<Cart> viewcart();

	void delFrmCart(int Id);
	
	

}
