package com.sofi.springboot.learnjdbcjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sofi.springboot.learnjdbcjpa.course.jdbc.CourseSpringJdbcRepository;
import com.sofi.springboot.learnjdbcjpa.course.jpa.CourseJpaRepository;
import com.sofi.springboot.learnjdbcjpa.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//   @Autowired  //1.For Spring JDBC
//   private CourseSpringJdbcRepository repo;

//	@Autowired // 2. For JPA
//	private CourseJpaRepository repo;

	@Autowired  //3.For Spring JPA
	private CourseSpringDataJpaRepository  repo;

	@Override
	public void run(String... args) throws Exception {

//--------------------------1. For Spring JDBC --------------------------------
//		//To Insert Data
//		repo.insert(new Course(1,"Learn Spring JPA --SpringJDBC","In28Minutes"));
//		repo.insert(new Course(2,"Learn  JPA --SpringJDBC","In28Minutes"));
//		repo.insert(new Course(3,"Learn Spring JDBC --SpringJDBC","In28Minutes"));
//		repo.insert(new Course(4,"Learn JDBC --SpringJDBC","In28Minutes"));
//	    repo.insert(new Course(5,"Learn Hibernate --SpringJDBC","In28Minutes"));
//        
//	    //To Delete Data By Id
//	    repo.deleteById(1);
//	    
//	    //To Find Data By Id
//	    System.out.println(repo.findById(2));
//		System.out.println(repo.findById(3));

//----------------------------2. For JPA-----------------------------------------
//		// To Insert Data
//		repo.insert(new Course(1, "Learn Spring JPA --JPA", "In28Minutes"));
//		repo.insert(new Course(2, "Learn  JPA --JPA", "In28Minutes"));
//		repo.insert(new Course(3, "Learn Spring JDBC --JPA", "In28Minutes"));
//		repo.insert(new Course(4, "Learn JDBC --JPA", "In28Minutes"));
//		repo.insert(new Course(5, "Learn Hibernate --JPA", "In28Minutes"));
//
//		// To Delete Data By Id
//		repo.deleteById(1);
//
//		// To Find Data By Id
//		System.out.println(repo.findById(2));
//		System.out.println(repo.findById(3));

//-----------------------------3. For Spring Data JPA ----------------------------
		//To Insert Data:We Use save() For SpringJPA Data Entry
		repo.save(new Course(1,"Learn Spring JPA --SpringJPA","In28Minutes"));
		repo.save(new Course(2,"Learn  JPA --SpringJPA","In28Minutes"));
		repo.save(new Course(3,"Learn Spring JDBC --SpringJPA","In28Minutes"));
		repo.save(new Course(4,"Learn JDBC --SpringJPA","In28Minutes"));
		repo.save(new Course(5,"Learn Hibernate --SpringJPA","In28Minutes"));
		
		//To Delete Data: We Use Long Id For SpringJPA
		repo.deleteById(1l);
		
		//To Find Data By ID: We use Long Id For Spring JPA
		System.out.println(repo.findById(2l));
		System.out.println(repo.findById(3l));
		
     	System.out.println(repo.count());
		
		// Retrieving and printing all courses
        System.out.println("All Courses:");
        repo.findAll().forEach(System.out::println);
        
        //Creating By Custom Method
        System.out.println(repo.findByAuthor("In28Minutes"));
        System.out.println(repo.findByAuthor(""));
       
        System.out.println(repo.findByName("Learn JDBC --SpringJPA"));
        System.out.println(repo.findByName("Learn Hibernate --SpringJPA"));

	}

}
