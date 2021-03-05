package com.masai.books.BookManagement;

import com.masai.books.BookManagement.entity.Review;
import com.masai.books.BookManagement.service.CourseService;
import com.masai.books.BookManagement.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookManagementApplication  {

	@Autowired
	CourseService courseService;

	@Autowired
	ReviewService reviewService;

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}

}
