package com.masai.books.BookManagement.repository;

import com.masai.books.BookManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByStudentName(String name);
    List<Student> deleteStudentByStudentName(String name);

    @Query(value = "select * from Student", nativeQuery = true)
    List<Student> findAllStudents();

    @Query(value = "select * from Student where name=:name", nativeQuery = true)
    List<Student> findAllStudents(String name);



    @Modifying
    @Query(value = "insert into Student (id,name) VALUES (?1, ?2)", nativeQuery = true)
    @Transactional
    void addStudents(@Param("id") Long id, @Param("name") String name);



}
