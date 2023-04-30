package com.simplilearn.spring.dependency.injection.autowiring.bynamebytype;

public class Library {
	
	private Book book;	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Library() {
		super();
		System.out.println("Library is created ...");
	}
	
	public void libraryInfo() {
		System.out.println("Library Book:: " + book);
	}
	
	public void display() {
		libraryInfo();
		book.bookInfo();
	}

}
