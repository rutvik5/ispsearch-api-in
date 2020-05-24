package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "comment")
@Entity
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMMENT_ID", insertable = false, nullable = false)
    private Integer commentId;

    @Column(name = "COMMENT_TEXT", nullable = false)
    private String commentText;

    @Column(name = "CREATE_DATE", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "DISLIKE_COUNT", nullable = false)
    private Integer dislikeCount;

    @Column(name = "LIKE_COUNT", nullable = false)
    private Integer likeCount;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private Integer customerId;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Integer getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(Integer dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getUserId() {
        return customerId;
    }

    public void setUserId(Integer userId) {
        this.customerId = userId;
    }

    public String toString() {
      return "Comment{commentId=" + commentId + 
        ", commentText=" + commentText + 
        ", createDate=" + createDate + 
        ", dislikeCount=" + dislikeCount + 
        ", likeCount=" + likeCount + 
        ", userId=" + customerId + 
        "}";
    }
}