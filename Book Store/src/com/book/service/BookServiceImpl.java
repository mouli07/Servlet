package com.book.service;

import java.util.Collection;

import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;
import com.book.pojo.Cart;

public class BookServiceImpl implements BookService {

	private BookDaoImpl dao=new BookDaoImpl();
	
	/* (non-Javadoc)
	 * @see com.bookshop.service.BookService#viewAllBooks()
	 */
	@Override
	public Collection<Book> viewAllBooks(){
		return dao.viewAllBooks();
	}
	
	
	@Override
	public void delFrmCart(int Id) {
		dao.delFrmCart(Id);
	}
	
	@Override
	public void addBookCart(int id) {
		
		dao.addBookCart(id);	
	}
	
	/* (non-Javadoc)
	 * @see com.bookshop.service.BookService#viewCart()
	 */
	@Override
	public Collection<Cart> viewCart(){
		return dao.viewcart();
	}
	

}
