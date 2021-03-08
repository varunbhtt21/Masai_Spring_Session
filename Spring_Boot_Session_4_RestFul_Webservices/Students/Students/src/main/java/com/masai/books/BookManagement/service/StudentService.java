package com.masai.books.BookManagement.service;

import com.masai.books.BookManagement.BookManagementApplication;
import com.masai.books.BookManagement.dto.StudentDto;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {

    static final Logger log=
            LoggerFactory.getLogger(BookManagementApplication.class);


    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ModelMapper modelMapper;


    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAllStudents("ROHAN");
        return students;
    }

    @Transactional
    public String addStudent() {
        studentRepository.addStudents(345L, "Sarosh");

        return "successfully add";
    }


    public Student updateStudent(Student student) {
        Student student1 = studentRepository.findById(student.getId()).get();
        student1.setStudentName(student.getStudentName());
        student1.setStudentName(student.getStudentName());
        studentRepository.save(student1);

        return student1;
    }

@Transactional
    public List<Student> deleteStudent(Long studentId) {
        List<Student> student = studentRepository.deleteStudentByStudentName("rahul");

      return student;
    }


    public Student getStudent(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        return student;
    }

    public StudentDto getStudentInfo(Long studentId) {

        Student student = studentRepository.findById(studentId).get();
        StudentDto studentDto = new StudentDto();

        modelMapper.map(student, studentDto);

        return studentDto;


    }
}
