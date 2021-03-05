package com.masai.books.BookManagement.service;


import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.repository.CourseRepository;
import com.masai.books.BookManagement.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    ReviewRepository reviewRepository;



    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }


    public Course insertCourse(Course course) {
        return courseRepository.save(course);

    }

    public boolean deleteCourse(Long courseId) {
        Course course = courseRepository.findById(courseId).get();

        try{
            courseRepository.delete(course);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }


    public Course updateCourse(Course course) {
        Course course1 = courseRepository.findById(course.getCourseId()).get();
        course1.setCourseName(course.getCourseName());
        courseRepository.save(course1);
        return course1;
    }


}
