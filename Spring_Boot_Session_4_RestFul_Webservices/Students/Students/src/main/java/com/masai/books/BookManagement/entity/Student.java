package com.masai.books.BookManagement.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class Student  {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(nullable = false,name = "name")
    private String studentName;


    public Student(Long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }


}
