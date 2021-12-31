package com.aos.registrationapp.domain;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer commentId ;
    private String CommentDetails;
    @ManyToOne
    private User user;


    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentDetails() {
        return CommentDetails;
    }

    public void setCommentDetails(String commentDetails) {
        CommentDetails = commentDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", CommentDetails='" + CommentDetails + '\'' +
                ", user=" + user +
                '}';
    }
}
