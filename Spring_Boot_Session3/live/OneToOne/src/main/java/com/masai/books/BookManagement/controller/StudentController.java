package com.masai.books.BookManagement.controller;

import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentsService;


    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> bookInfo = studentsService.getAllStudents();
        return bookInfo;
    }


    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        Student bookInfo = studentsService.addStudent(student);
        return bookInfo;
    }



}
