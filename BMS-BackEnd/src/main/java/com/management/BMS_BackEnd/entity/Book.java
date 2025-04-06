package com.management.BMS_BackEnd.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="book")
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable = false)
	private BookCategory category;
	
	@ManyToOne
	@JoinColumn(name="author_id", nullable = false)
	private BookAuthor author;
	
	@ManyToOne
	@JoinColumn(name="status_id", nullable = false)
	private BookStatus status;
	
	@ManyToOne
	@JoinColumn(name="language_id", nullable = false)
	private BookLanguage language;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "book_image")
	private String bookImage;
	
	@Column(name = "date_add")
	@CreationTimestamp
	private Date dateAdd;
	
	@Column(name = "date_finish")
	@UpdateTimestamp
	private Date dateFinish;
}
