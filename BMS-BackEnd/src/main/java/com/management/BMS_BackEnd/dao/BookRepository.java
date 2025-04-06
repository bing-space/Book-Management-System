package com.management.BMS_BackEnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.BMS_BackEnd.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
