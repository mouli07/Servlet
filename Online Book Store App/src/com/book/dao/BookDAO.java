package com.book.dao;


import java.util.Collection;

import com.book.pojo.Book;
import com.book.pojo.Cart;

public interface BookDAO {

	Collection<Book> viewAllBooks();

	void addBookCart(int id);

	Collection<Cart> viewcart();

	void delFrmCart(int Id);

	int getTotalQuantity();
	
	double getTotalPrice();
}
