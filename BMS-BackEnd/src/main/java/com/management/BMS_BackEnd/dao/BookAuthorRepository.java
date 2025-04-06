package com.management.BMS_BackEnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.management.BMS_BackEnd.entity.BookAuthor;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "bookAuthor", path="book-author")
public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long>{

}
