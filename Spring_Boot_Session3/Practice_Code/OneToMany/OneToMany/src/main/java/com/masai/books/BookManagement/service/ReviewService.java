package com.masai.books.BookManagement.service;

import com.masai.books.BookManagement.BookManagementApplication;
import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.entity.Review;
import com.masai.books.BookManagement.repository.CourseRepository;
import com.masai.books.BookManagement.repository.ReviewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReviewService {

    static final Logger log =
            LoggerFactory.getLogger(BookManagementApplication.class);

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    CourseRepository courseRepository;


    public List<Review> getAllReviews(){
        List<Review> reviews = reviewRepository.findAll();
        return reviews;
    }

    public Review addReview(Review review) {

        Review review1 = reviewRepository.save(review);
        return review1;
    }


    public Review updateReview(Review review) {
        Review review1 = reviewRepository.findById(review.getReviewId()).get();
        review1.setRating(review.getRating());
        review1.setDescription(review.getDescription());
        reviewRepository.save(review1);

        return review1;
    }


    public boolean deleteReview(Long reviewId) {
        Review review = reviewRepository.findById(reviewId).get();

        try{
            reviewRepository.delete(review);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }


    @Transactional
    public void getReviews() {
        Course course = courseRepository.findById(103L).get();
        log.info("course.getReviews() --> {}",course.getReviewList());

    }


}
