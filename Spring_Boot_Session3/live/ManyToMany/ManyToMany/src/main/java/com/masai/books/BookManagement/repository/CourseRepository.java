package com.masai.books.BookManagement.repository;

import com.masai.books.BookManagement.entity.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {

}
