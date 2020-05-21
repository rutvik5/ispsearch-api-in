package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "bookmark_isp")
@Entity
public class BookmarkIsp implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOKMARK_ISP_ID", insertable = false, nullable = false)
    private Integer bookmarkIspId;

    @Column(name = "ISP_ID", nullable = false)
    private Integer ispId;

    @Column(name = "USER_ID", nullable = false)
    private Integer userId;

    public Integer getBookmarkIspId() {
        return bookmarkIspId;
    }

    public void setBookmarkIspId(Integer bookmarkIspId) {
        this.bookmarkIspId = bookmarkIspId;
    }

    public Integer getIspId() {
        return ispId;
    }

    public void setIspId(Integer ispId) {
        this.ispId = ispId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String toString() {
      return "BookmarkIsp{bookmarkIspId=" + bookmarkIspId + 
        ", ispId=" + ispId + 
        ", userId=" + userId + 
        "}";
    }
}