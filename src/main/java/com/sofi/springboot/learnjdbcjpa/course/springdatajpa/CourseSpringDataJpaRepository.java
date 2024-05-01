package com.sofi.springboot.learnjdbcjpa.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofi.springboot.learnjdbcjpa.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	//Create Custom Method
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);

}
