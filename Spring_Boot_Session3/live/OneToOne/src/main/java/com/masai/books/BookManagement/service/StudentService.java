package com.masai.books.BookManagement.service;

//import com.masai.books.BookManagement.repository.BookRepository;
import com.masai.books.BookManagement.BookManagementApplication;
import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.repository.PassportRepository;
import com.masai.books.BookManagement.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PassportRepository passportRepository;

    static final Logger log=
            LoggerFactory.getLogger(BookManagementApplication.class);



    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        return students;
    }



    public Student addStudent(Student student) {

        return studentRepository.save(student);
    }



}
