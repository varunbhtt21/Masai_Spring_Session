//package com.masai.books.BookManagement.service;
//
//import com.masai.books.BookManagement.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BooksService {
//
//    @Autowired
//    BookRepository bookRepository;
//
//    public List<Book> getAllBooks(){
//        List<Book> books = bookRepository.findAll();
//        return books;
//    }
//
//    public Book addBook(Book book) {
//        Book book1 = bookRepository.save(book);
//        return book1;
//    }
//
//
//    public Book updateBook(Book book) {
//        Book book1 = bookRepository.findById(book.getId()).get();
//        book1.setBookName(book.getBookName());
//        book1.setStudentName(book.getStudentName());
//
//        bookRepository.save(book1);
//
//        return book1;
//    }
//
//    public boolean deleteBook(Long bookId) {
//        Book book1 = bookRepository.findById(bookId).get();
//
//        try{
//            bookRepository.delete(book1);
//            return true;
//        }
//        catch (Exception ex){
//            return false;
//        }
//    }
//}
