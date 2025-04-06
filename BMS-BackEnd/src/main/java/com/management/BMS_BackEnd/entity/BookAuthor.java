package com.management.BMS_BackEnd.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="book_author")
@Getter
@Setter
public class BookAuthor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "author")
	private String author;
	
	@Column(name = "author_english")
	private String authorEnglish;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
	private Set<Book> books;
}
