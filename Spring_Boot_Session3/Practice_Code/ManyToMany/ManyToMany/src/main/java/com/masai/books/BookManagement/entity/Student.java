package com.masai.books.BookManagement.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table( uniqueConstraints = { @UniqueConstraint(columnNames = {"passport_id"})})
@NoArgsConstructor
@Getter
@Setter

public class Student  {

    @Id
    private Long id;

    @Column(nullable = false)
    private String studentName;


    @ManyToMany
    @JoinTable(name = "Student_Courses",
            joinColumns = @JoinColumn(name = "STUDENT_ID"),
                    inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private List<Courses> courses = new ArrayList<>();






    public Student(Long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public void addCourse(Courses course){
        this.courses.add(course);
    }

    public void removeStudent(Courses courses){
        this.courses.remove(courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", courses=" + courses +
                '}';
    }
}
