package com.masai.books.BookManagement.controller;


import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;


    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @PostMapping("/course")
    public Course insertCourse(@RequestBody Course course){
        return courseService.insertCourse(course);
    }

    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{id}")
    public String deleteCourse(@PathVariable("id") Long courseId){

        boolean flag = courseService.deleteCourse(courseId);
        if(flag) return "Entry Deleted";
        else return "Fail to Delete";
    }



}
