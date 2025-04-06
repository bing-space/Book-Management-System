package com.management.BMS_BackEnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.management.BMS_BackEnd.entity.BookAuthor;

@RepositoryRestResource(collectionResourceRel = "bookAuthor", path="book-author")
public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long>{

}
