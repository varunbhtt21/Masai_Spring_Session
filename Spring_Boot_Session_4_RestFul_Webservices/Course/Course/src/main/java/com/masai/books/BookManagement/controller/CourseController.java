package com.masai.books.BookManagement.controller;

import com.masai.books.BookManagement.entity.Courses;
import com.masai.books.BookManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/hello")
    public ResponseEntity<String> replyHello(){
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Hello world", HttpStatus.NOT_FOUND);
        return responseEntity;
    }


    @PostMapping("/assign/{id1}/{id2}")
    public String assignCourse(@PathVariable("id1") Long studentId,
                               @PathVariable("id2") Long courseId){

        return courseService.assignCourse(studentId, courseId);
    }




    @GetMapping("/courses")
    public List<Courses> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping("/course")
    public Courses insertCourses(@RequestBody Courses course){
        return courseService.insertCourses(course);
    }

    @PutMapping("/course")
    public Courses updateCourses(@RequestBody Courses course){
        return courseService.updateCourses(course);
    }

    @DeleteMapping("/course/{id}")
    public String deleteCourses(@PathVariable("id") Long courseId){

        boolean flag = courseService.deleteCourses(courseId);
        if(flag) return "Entry Deleted";
        else return "Fail to Delete";
    }

}
