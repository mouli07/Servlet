package com.book.pojo;

//to implement the book object
public class Book {
	
	private int id;
	private String name;
	private double price;
	private String author;
	private String description;
	
	//parameterized constructor
	public Book(int id, String name, double price, String author, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", description="
				+ description + "]";
	}

	//getter methods to retrieve the private instances from outside
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public String getDescription() {
		return description;
	}
	
}
