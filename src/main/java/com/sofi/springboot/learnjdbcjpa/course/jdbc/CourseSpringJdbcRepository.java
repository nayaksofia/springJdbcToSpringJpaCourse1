package com.sofi.springboot.learnjdbcjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sofi.springboot.learnjdbcjpa.course.Course;

@Repository
public class CourseSpringJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;

	//SQL QUERIES
	private static String INSERT_QUERY = """
			  insert into course (id, name, author) values (?,?,?)
			""";

	private static String DELETE_QUERY = """
			  delete from course where id = ?;
			""";

	private static String SELECT_QUERY = """
			  select * from course where id = ?
			""";

	// Method For Insertion
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	// Method For Deletion
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}

	// Method For Selection
	public Course findById(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);

	}
}

/*
 * Note: -------- JDBC Vs. Spring JDBC--------------------
 * IN JDBC: We write lot of SQL queries and lot of java code. IN
 * SPRING JDBC : We write a lot of SQL queries and less java code. [SPRING JDBC
 * Is Better Than JDBC]
 */
