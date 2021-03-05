package com.masai.books.BookManagement.controller;

import com.masai.books.BookManagement.entity.Review;
import com.masai.books.BookManagement.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    ReviewService reviewsService;



    @GetMapping("/reviews")
    public List<Review> getAllReviews(){
        List<Review> bookInfo = reviewsService.getAllReviews();
        return bookInfo;
    }
//    @GetMapping("/rev")
//    public List<Review> getReviews(){
//        return reviewsService.getReviews();
//
//    }


    @PostMapping("/review")
    public Review addReview(@RequestBody Review review){
        Review review1 = reviewsService.addReview(review);
        return review1;
    }

    @PutMapping("/review")
    public Review updateReview(@RequestBody Review review){
        Review review1 = reviewsService.updateReview(review);
        return review1;
    }

    @DeleteMapping("/review/{id}")
    public String deleteReview(@PathVariable("id") Long reviewId){

        boolean flag = reviewsService.deleteReview(reviewId);
        if(flag) return "Entry Deleted";
        else return "Fail to Delete";
    }


//    @PostMapping("/review/{id}/passport")
//    public Review addPassport(@RequestBody Passport passport, @PathVariable("id") Long reviewId){
//        Review review = reviewsService.addPassport(passport, reviewId);
//        return review;
//    }


}
