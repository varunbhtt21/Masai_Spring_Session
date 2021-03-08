package com.masai.books.BookManagement.service;


import com.masai.books.BookManagement.entity.AssignStudent;
import com.masai.books.BookManagement.entity.Courses;

import com.masai.books.BookManagement.repository.AssignedRepo;
import com.masai.books.BookManagement.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    AssignedRepo assignedRepo;


    public List<Courses> getAllCourses() {
        return courseRepository.findAll();
    }


    public Courses insertCourses(Courses course) {
        return courseRepository.save(course);

    }

    public boolean deleteCourses(Long courseId) {
        Courses course = courseRepository.findById(courseId).get();

        try{
            courseRepository.delete(course);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }


    public Courses updateCourses(Courses course) {
        Courses course1 = courseRepository.findById(course.getCourseId()).get();
        course1.setCourseName(course.getCourseName());
        courseRepository.save(course1);
        return course1;
    }


    public String assignCourse(Long studentId, Long courseId) {

        AssignStudent assignStudent = new AssignStudent();

        assignStudent.setCourseId(courseId);
        assignStudent.setStudId(studentId);

        assignedRepo.save(assignStudent);

        return "assigned successfully";

    }
}
