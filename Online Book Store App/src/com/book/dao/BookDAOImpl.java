package com.book.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import com.book.pojo.Book;
import com.book.pojo.Cart;

public class BookDAOImpl implements BookDAO {
	
	private static Map<Integer, Book> bookDB = new HashMap<>();
	
	private static Map<Integer, Cart> cart = new HashMap<>();

	private static Book bookOne = new Book(101,"Harry Potter and the Chamber of Secrets",800,"J.K Rowling","A real page turner.");
	private static Book bookTwo = new Book(102,"The sins of the father",400,"Jeffrey Archer","Great Book.");
	private static Book bookThree = new Book(103,"The Alchemist",350,"Paulo Coelho","A real page turner.");
	private static Book bookFour = new Book(104,"The Monk who sold his Ferrari",200,"Robin Sharma","Great Book.");
	
	static {
		bookDB.put(bookOne.getId(), bookOne);
		bookDB.put(bookTwo.getId(), bookTwo);
		bookDB.put(bookThree.getId(), bookThree);
		bookDB.put(bookFour.getId(), bookFour);
	}
	
	
	@Override
	public Collection<Book> viewAllBooks(){
		return bookDB.values();
	}
	
	@Override
	public void addBookCart(int id) {
		if(cart.get(id)==null)
		{
			for(Book book : viewAllBooks())
			{
				if(book.getId()==id)
				{
					Cart crt = new Cart(1,book);
					cart.put(id,crt);
				}
			}
		}
		else
		{
			Cart crt = cart.get(id);
			crt.setQuantity(crt.getQuantity()+1);
		}
	}
	
	@Override
	public Collection<Cart> viewcart(){
		return cart.values();
	}
	

	@Override
	public void delFrmCart(int id) {
		for(Cart cartV : viewcart())
		{
			if(cartV.getBook().getId()==id)
			{
				if(cartV.getQuantity()>1)
				{	
					cartV.setQuantity(cartV.getQuantity()-1);
					break;
				}
				else
				{	
					cart.remove(id);
					break;
				}
			}
		}
	}
	
	public int getTotalQuantity() {
		
		int totalQuantity = 0;
		for(Cart cartV : viewcart()) {
			totalQuantity += cartV.getQuantity();
		}
		
		//System.out.println(totalPrice);
		return totalQuantity;
	}
	
	public double getTotalPrice() {
		
		double totalPrice=0.0;
		
		for(Cart cartV : viewcart()) {
			totalPrice+=(cartV.getQuantity())*(cartV.getBook().getPrice());
		}
		
		//System.out.println(totalPrice);
		return totalPrice;
	}
}

