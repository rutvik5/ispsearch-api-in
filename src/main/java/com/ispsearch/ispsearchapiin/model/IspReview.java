package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "isp_review")
@Entity
public class IspReview implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "COMMENT_ID", nullable = false)
    private Integer commentId;

    @Column(name = "ISP_ID", nullable = false)
    private Integer ispId;

    @Column(name = "ISP_RATING", nullable = false)
    private String ispRating;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISP_REVIEW_ID", insertable = false, nullable = false)
    private Integer ispReviewId;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getIspId() {
        return ispId;
    }

    public void setIspId(Integer ispId) {
        this.ispId = ispId;
    }

    public String getIspRating() {
        return ispRating;
    }

    public void setIspRating(String ispRating) {
        this.ispRating = ispRating;
    }

    public Integer getIspReviewId() {
        return ispReviewId;
    }

    public void setIspReviewId(Integer ispReviewId) {
        this.ispReviewId = ispReviewId;
    }

    public String toString() {
      return "IspReview{commentId=" + commentId + 
        ", ispId=" + ispId + 
        ", ispRating=" + ispRating + 
        ", ispReviewId=" + ispReviewId + 
        "}";
    }
}