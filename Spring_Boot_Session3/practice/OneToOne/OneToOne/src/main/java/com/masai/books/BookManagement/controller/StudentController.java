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




    @PostMapping("/assign/student/{id}/passport")
    public Student assignPassport(@PathVariable("id") Long studentId,
                                  @RequestBody Passport passport){

        return studentsService.assignPassport(studentId, passport);

    }







//
//    @GetMapping("/student/{id}")
//    public Student getStudent(@PathVariable("id") Long studentId){
//        Student student = studentsService.getStudent(studentId);
//        return student;
//    }
//
//

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        Student bookInfo = studentsService.addStudent(student);
        return bookInfo;
    }
//
//    @PutMapping("/student")
//    public Student updateStudent(@RequestBody Student book){
//        Student bookInfo = studentsService.updateStudent(book);
//        return bookInfo;
//    }
//
//    @DeleteMapping("/student/{id}")
//    public String deleteStudent(@PathVariable("id") Long studentId){
//
//        boolean flag = studentsService.deleteStudent(studentId);
//        if(flag) return "Entry Deleted";
//        else return "Fail to Delete";
//    }
//
//
//    @PutMapping("/student/{id}/passport")
//    public Student addPassport(@RequestBody Passport passport, @PathVariable("id") Long studentId){
//        Student student = studentsService.addPassport(passport, studentId);
//        return student;
//    }


}
