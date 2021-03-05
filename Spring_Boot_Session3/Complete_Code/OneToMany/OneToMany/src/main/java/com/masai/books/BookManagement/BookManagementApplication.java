package com.masai.books.BookManagement;

import com.masai.books.BookManagement.entity.Review;
import com.masai.books.BookManagement.repository.CourseRepository;
import com.masai.books.BookManagement.service.CourseService;
import com.masai.books.BookManagement.service.ReviewService;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookManagementApplication implements CommandLineRunner {

	@Autowired
	CourseService courseService;

	@Autowired
	ReviewService reviewService;

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

//		reviewService.getReviews();
//
		List<Review> reviews = new ArrayList<>();
		Review review1 = new Review(205L,5L,"nice",null);
		Review review2 = new Review(206L,5L,"bravo",null);

		reviews.add(review1);
		reviews.add(review2);

		courseService.addReviewForCourse(123L, reviews);
	}
}
