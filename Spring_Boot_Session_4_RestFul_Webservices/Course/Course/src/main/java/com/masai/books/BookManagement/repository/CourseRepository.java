package com.masai.books.BookManagement.repository;

import com.masai.books.BookManagement.entity.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {


    @Query("from Courses ")
    List<Courses> findAllCourse();

}
