package com.book.service;
import java.util.Collection;

import com.book.dao.BookDAOImpl;
import com.book.pojo.Book;
import com.book.pojo.Cart;

public class BookServiceImpl implements BookService {

	private BookDAOImpl bkDao = new BookDAOImpl();
	
	
	@Override
	public Collection<Book> viewAllBooks(){
		return bkDao.viewAllBooks();
	}
	

	@Override
	public void delFrmCart(int Id) {
		bkDao.delFrmCart(Id);
	}
	
	@Override
	public void addBookCart(int id) {
		bkDao.addBookCart(id);	
	}
	
		@Override
	public Collection<Cart> viewCart(){
		return bkDao.viewcart();
	}
	
	public int getTotalQuantity() {
		return bkDao.getTotalQuantity();
	}
	
	public double getTotalPrice() {
		return bkDao.getTotalPrice();
	}
}

