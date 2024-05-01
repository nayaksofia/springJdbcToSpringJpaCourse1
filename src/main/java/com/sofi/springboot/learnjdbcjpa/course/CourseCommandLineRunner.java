package com.sofi.springboot.learnjdbcjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sofi.springboot.learnjdbcjpa.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired  //For Spring JPA
	private CourseSpringDataJpaRepository  repo;

	@Override
	public void run(String... args) throws Exception {
		
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
