package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "plan_review")
@Entity
public class PlanReview implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "COMMENT_ID", nullable = false)
    private Integer commentId;

    @Column(name = "PLAN_ID", nullable = false)
    private Integer planId;

    @Column(name = "PLAN_RATING", nullable = false)
    private String planRating;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAN_REVIEW_ID", insertable = false, nullable = false)
    private Integer planReviewId;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanRating() {
        return planRating;
    }

    public void setPlanRating(String planRating) {
        this.planRating = planRating;
    }

    public Integer getPlanReviewId() {
        return planReviewId;
    }

    public void setPlanReviewId(Integer planReviewId) {
        this.planReviewId = planReviewId;
    }

    public String toString() {
      return "PlanReview{commentId=" + commentId + 
        ", planId=" + planId + 
        ", planRating=" + planRating + 
        ", planReviewId=" + planReviewId + 
        "}";
    }
}