package com.management.BMS_BackEnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.management.BMS_BackEnd.entity.BookLanguage;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "bookLanguage", path="book-language")
public interface BookLanguageRepository extends JpaRepository<BookLanguage, Long> {

}
