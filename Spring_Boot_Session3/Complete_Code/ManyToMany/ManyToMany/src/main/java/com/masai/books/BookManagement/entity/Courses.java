package com.masai.books.BookManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Courses {

    @Id
    private Long courseId;
    private String courseName;


    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();





    public Courses(Long courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }

}
