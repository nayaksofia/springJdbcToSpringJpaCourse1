package com.sofi.springboot.learnjdbcjpa.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofi.springboot.learnjdbcjpa.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	

}
