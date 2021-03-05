package com.masai.books.BookManagement;

import com.masai.books.BookManagement.service.PassportService;
import com.masai.books.BookManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookManagementApplication {

	@Autowired
	PassportService passportService;

	@Autowired
	StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}



}
