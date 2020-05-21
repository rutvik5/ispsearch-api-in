package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bookmark_plan")
public class BookmarkPlan implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKMARK_PLAN_ID", nullable = false)
    private Integer bookmarkPlanId;

    @Column(name = "PLAN_ID", nullable = false)
    private Integer planId;

    @Column(name = "USER_ID", nullable = false)
    private Integer userId;

    public Integer getBookmarkPlanId() {
        return bookmarkPlanId;
    }

    public void setBookmarkPlanId(Integer bookmarkPlanId) {
        this.bookmarkPlanId = bookmarkPlanId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String toString() {
      return "BookmarkPlan{bookmarkPlanId=" + bookmarkPlanId + 
        ", planId=" + planId + 
        ", userId=" + userId + 
        "}";
    }
}