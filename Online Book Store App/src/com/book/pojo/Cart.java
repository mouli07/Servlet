package com.book.pojo;

public class Cart {
	
	private int quantity;
	private Book book;
	
	//parameterized constructor
	public Cart(int quantity, Book book) {
		this.quantity = quantity;
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book getBook() {
		return book;
	}

	@Override
	public String toString() {
		return "Cart [quantity=" + quantity + ", book=" + book + "]";
	}
	
	
}

