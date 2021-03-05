package com.masai.books.BookManagement.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table( uniqueConstraints = { @UniqueConstraint(columnNames = {"passport_id"})})
public class Student {

    @Id
    Long studentId;
    String studentName;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "passport_id")
    Passport passport;


}
