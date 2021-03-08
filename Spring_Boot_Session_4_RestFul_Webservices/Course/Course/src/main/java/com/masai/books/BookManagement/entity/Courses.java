package com.masai.books.BookManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "course")
public class Courses {

    @Id
    @Column(name = "id")
    private Long courseId;
    @Column(name = "cName")
    private String courseName;




    public Courses(Long courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

}
