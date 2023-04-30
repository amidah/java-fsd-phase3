package com.simplilearn.spring.dependency.injection.autowiring.bynamebytype;

public class Book {
	
	private String isbn;
	
	private double price;
	
	private String bookType;

	public Book() {
		super();
		System.out.println("Book is created...");
	}
	
	public Book(String isbn, double price, String bookType) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.bookType = bookType;
	}



	public void bookInfo() {
		System.out.println("Book ISBN:: " + isbn);
		System.out.println("Book Price:: " + price);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", bookType=" + bookType + "]";
	}

	
	
	
	

}
