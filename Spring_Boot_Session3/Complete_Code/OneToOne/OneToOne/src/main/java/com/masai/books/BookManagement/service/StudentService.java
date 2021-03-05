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



    // Purpose  Give this function : Student Id
    // OUTPUT : Information of your passport


    @Transactional
    public void getPassportOfStudent(Long studentId) {
       Student student = studentRepository.findById(studentId).get();
       System.out.println(student.getPassport().getPassportId());
        System.out.println(student.getPassport().getPassportNumber());
    }



    public void addPassport() {

        Student student = studentRepository.findById(342L).get();
        Passport passport = new Passport(258L, "Ehgdhfg");

        passportRepository.save(passport);

        student.setPassport(passport);
        studentRepository.save(student);

    }

    public Student assignPassport(Long studentId, Passport passport) {

        // Step 1 : Get Student Object

        Student student = studentRepository.findById(studentId).get();


        passportRepository.save(passport);

        student.setPassport(passport);
        studentRepository.save(student);

        return student;
    }
}
