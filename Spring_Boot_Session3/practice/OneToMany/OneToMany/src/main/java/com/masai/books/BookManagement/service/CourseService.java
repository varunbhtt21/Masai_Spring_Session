package com.masai.books.BookManagement.service;


import com.masai.books.BookManagement.BookManagementApplication;
import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.entity.Review;
import com.masai.books.BookManagement.repository.CourseRepository;
import com.masai.books.BookManagement.repository.ReviewRepository;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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


    @Transactional
    public void addReviewForCourse(Long courseId, List<Review> reviews) {
        Course course = courseRepository.findById(103L).get();
//      log.info("course.getReviews() --> {}",course.getReviewList());

        for(Review review : reviews){
            course.addReview(review);
            review.setCourse(course);
            reviewRepository.save(review);
        }

    }
}
