package com.wechat.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Post {
    private Integer postId;

    private String postTopic;

    private String postRead;

    private String postGoodCount;

    private String userId;

    private String postReward;

    private String postType;

    private String postContent;

    private User user;

    private Date createTime;

    private List<String> postImage;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date updateTime;

    public List<String> getPostImage() {
        return postImage;
    }

    public void setPostImage(List<String> postImage) {
        this.postImage = postImage;
    }

    private String isPraise;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getIsPraise() {
        return isPraise;
    }

    public void setIsPraise(String isPraise) {
        this.isPraise = isPraise;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostGoodCount() {
        return postGoodCount;
    }

    public void setPostGoodCount(String postGoodCount) {
        this.postGoodCount = postGoodCount;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTopic() {
        return postTopic;
    }

    public void setPostTopic(String postTopic) {
        this.postTopic = postTopic;
    }

    public String getPostRead() {
        return postRead;
    }

    public void setPostRead(String postRead) {
        this.postRead = postRead;
    }

    public void setPostGoodcount(String postGoodcount) {
        this.postGoodCount = postGoodcount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostReward() {
        return postReward;
    }

    public void setPostReward(String postReward) {
        this.postReward = postReward;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postTopic='" + postTopic + '\'' +
                ", postRead='" + postRead + '\'' +
                ", postGoodCount='" + postGoodCount + '\'' +
                ", userId='" + userId + '\'' +
                ", postReward='" + postReward + '\'' +
                ", postType='" + postType + '\'' +
                ", postContent='" + postContent + '\'' +
                ", createTime=" + createTime +
                ", postImage=" + postImage +
                ", updateTime=" + updateTime +
                ", isPraise='" + isPraise + '\'' +
                '}';
    }
}