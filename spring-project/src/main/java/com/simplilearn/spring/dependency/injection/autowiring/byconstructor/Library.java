package com.simplilearn.spring.dependency.injection.autowiring.byconstructor;

import com.simplilearn.spring.dependency.injection.autowiring.bynamebytype.Book;

public class Library {
	private Book book;

	private Employee emp;

	public Library() {
		System.out.println("Library is created ...");
	}

	public Library(Book book) {
		this.book = book;
	}

	public Library(Book book, Employee emp) {
		this.book = book;
		this.emp = emp;
	}

	public void libraryInfo() {
		System.out.println("Library Book:: " + book);
		System.out.println("Library Employee:: " + emp);
	}

	public void display() {
		libraryInfo();
		book.bookInfo();
		emp.employeeInfo();
	}

}
