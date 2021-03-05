package com.masai.books.BookManagement;

import com.masai.books.BookManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookManagementApplication implements CommandLineRunner {

	@Autowired
	StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		studentService.insertCourses();
	}
}
