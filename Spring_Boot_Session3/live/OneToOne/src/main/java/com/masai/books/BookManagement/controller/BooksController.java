//package com.masai.books.BookManagement.controller;
//
//import com.masai.books.BookManagement.service.BooksService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class BooksController {
//
//    @Autowired
//    BooksService booksService;
//
//    @GetMapping("/books")
//    public List<Book> getAllBooks(){
//        List<Book> bookInfo = booksService.getAllBooks();
//        return bookInfo;
//    }
//
//    @PostMapping("/book")
//    public Book addBook(@RequestBody Book book){
//        Book bookInfo = booksService.addBook(book);
//        return bookInfo;
//    }
//
//    @PutMapping("/book")
//    public Book updateBook(@RequestBody Book book){
//        Book bookInfo = booksService.updateBook(book);
//        return bookInfo;
//    }
//
//    @DeleteMapping("/book/{id}")
//    public String deleteBook(@PathVariable("id") Long bookId){
//        boolean flag = booksService.deleteBook(bookId);
//
//        if(flag) return "Entry Deleted";
//        else return "Fail to Delete";
//    }
//
//}
