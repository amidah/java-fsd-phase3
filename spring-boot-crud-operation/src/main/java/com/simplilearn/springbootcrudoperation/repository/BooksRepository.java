package com.simplilearn.springbootcrudoperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.springbootcrudoperation.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>{

}
