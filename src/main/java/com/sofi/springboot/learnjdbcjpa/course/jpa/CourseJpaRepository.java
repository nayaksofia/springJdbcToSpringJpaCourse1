package com.sofi.springboot.learnjdbcjpa.course.jpa;

import org.springframework.stereotype.Repository;

import com.sofi.springboot.learnjdbcjpa.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager; // Manage the entities

	// Insert Method: Inserting Rows
	public void insert(Course jpacourse) {
		entityManager.merge(jpacourse);
	}

	// Find Method : Select By Id
	public Course findById(long Id) {
		return entityManager.find(Course.class, Id);
	}

	// Delete Method : Delete By Id
	public void deleteById(long Id) {
		Course jp_course = entityManager.find(Course.class, Id);
		entityManager.remove(jp_course);
	}

}

/*
 * Note: SQL QUERIES are replaced and managed by EntityManager in JPA.
 * Therefore, not to worries about SQL QUERIES in JPA.
 * 
 */

