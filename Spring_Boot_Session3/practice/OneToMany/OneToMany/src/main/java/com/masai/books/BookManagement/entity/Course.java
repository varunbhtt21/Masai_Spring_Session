package com.masai.books.BookManagement.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    Long courseId;
    String courseName;

    @ToString.Exclude
    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Review> reviewList = new ArrayList<>();

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void addReview(Review review) {
        this.reviewList.add(review);
    }

    public void removeReview(Review review){
        this.reviewList.remove(review);
    }
}
