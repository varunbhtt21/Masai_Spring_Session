package com.masai.books.BookManagement.repository;

import com.masai.books.BookManagement.entity.AssignStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignedRepo extends JpaRepository<AssignStudent,Long> {
}
