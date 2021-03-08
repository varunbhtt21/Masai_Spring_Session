package com.masai.books.BookManagement.controller;

import com.masai.books.BookManagement.BookManagementApplication;
import com.masai.books.BookManagement.dto.Courses;
import com.masai.books.BookManagement.dto.StudentDto;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentsService;

    static final Logger log=
            LoggerFactory.getLogger(BookManagementApplication.class);


    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        ResponseEntity<String> reply = restTemplate.getForEntity("http://localhost:8050/hello",String.class);
        System.out.println(reply.getStatusCode().value());
        return reply;

    }

    @GetMapping("/studentInfo/{id}")
    public StudentDto getStudentInfo(@PathVariable("id") Long id){
        return studentsService.getStudentInfo(id);
    }


    @GetMapping("/courses")
    public List<Courses> getCourses(){

        List<Courses> courses = restTemplate.getForObject("http://localhost:8050/courses",List.class);
        return courses;
    }

    @GetMapping("/assign/{id1}/{id2}")
    public String assignCourses(@PathVariable("id1") String studentId ,
                                @PathVariable("id2") String courseId){

        String reply = restTemplate.postForObject("http://localhost:8050/assign/"+studentId+"/"+courseId,null,String.class);
        return reply;
    }




    @GetMapping("/students")
    public List<Student> getAllStudents(){

        List<Student> bookInfo = studentsService.getAllStudents();
        return bookInfo;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") Long studentId){
        Student student = studentsService.getStudent(studentId);
        return student;
    }



    @PostMapping("/student")
    public String addStudent(){
         return studentsService.addStudent();

    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student book){
        Student bookInfo = studentsService.updateStudent(book);
        return bookInfo;
    }

    @DeleteMapping("/student/{id}")
    public List<Student> deleteStudent(@PathVariable("id") Long studentId){

        return studentsService.deleteStudent(studentId);

    }



}
