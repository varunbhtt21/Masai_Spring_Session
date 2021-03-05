package com.masai.books.BookManagement.service;

import com.masai.books.BookManagement.BookManagementApplication;
import com.masai.books.BookManagement.entity.Courses;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.repository.CourseRepository;
import com.masai.books.BookManagement.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    static final Logger log=
            LoggerFactory.getLogger(BookManagementApplication.class);

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;


    @Autowired
    CourseRepository passportRepository;

    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        return students;
    }

    public Student addStudent(Student student) {

        Student student1 = studentRepository.save(student);
        return student1;
    }


    public Student updateStudent(Student student) {
        Student student1 = studentRepository.findById(student.getId()).get();
        student1.setStudentName(student.getStudentName());
        student1.setStudentName(student.getStudentName());
        studentRepository.save(student1);

        return student1;
    }


    public boolean deleteStudent(Long studentId) {
        Student student = studentRepository.findById(studentId).get();

        try{
            studentRepository.delete(student);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }


    public Student getStudent(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        return student;
    }


}
