package com.sofi.springboot.learnjdbcjpa.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Java Bean or POJO Class

@Entity
@Table(name = "Course Details")
public class Course {

	@Id
	private long id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Author")
	private String author;

// 1. Generate Non-parameterised Constructor
	public Course() {
		super();
	}

// 2. Generate Parameterized Constructor
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

//3. Generate Getter and Setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

//4. Generate ToString Method 

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
