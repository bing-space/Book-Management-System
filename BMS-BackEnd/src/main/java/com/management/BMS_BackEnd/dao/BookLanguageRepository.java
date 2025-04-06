package com.management.BMS_BackEnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.management.BMS_BackEnd.entity.BookLanguage;

@RepositoryRestResource(collectionResourceRel = "bookLanguage", path="book-language")
public interface BookLanguageRepository extends JpaRepository<BookLanguage, Long> {

}
