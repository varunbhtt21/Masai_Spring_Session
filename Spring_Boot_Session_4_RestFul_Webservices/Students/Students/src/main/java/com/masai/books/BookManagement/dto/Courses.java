package com.masai.books.BookManagement.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Courses {
    private Long courseId;
    private String courseName;
}
