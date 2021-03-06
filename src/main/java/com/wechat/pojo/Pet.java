package com.wechat.pojo;

import java.util.Date;

public class Pet {
    private Integer petId;
    private String petType;
    private String petPrice;
    private String userId;
    private String petTitle;
    private String petDesc;
    private Date createtime;
    private Date updatetime;
    private String petCity;
    private String wx;
    private String phone;
    private String petName;
    private String petAge;
    private String petGender;
    private String petBreed;
    private String isVaccine;
    private User user;
    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetPrice() {
        return petPrice;
    }

    public void setPetPrice(String petPrice) {
        this.petPrice = petPrice;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPetTitle() {
        return petTitle;
    }

    public void setPetTitle(String petTitle) {
        this.petTitle = petTitle == null ? null : petTitle.trim();
    }



    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getPetCity() {
        return petCity;
    }

    public void setPetCity(String petCity) {
        this.petCity = petCity == null ? null : petCity.trim();
    }

    public String getPetDesc() {
        return petDesc;
    }

    public void setPetDesc(String petDesc) {
        this.petDesc = petDesc == null ? null : petDesc.trim();
    }



    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetAge() {
        return petAge;
    }

    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getIsVaccine() {
        return isVaccine;
    }

    public void setIsVaccine(String isVaccine) {
        this.isVaccine = isVaccine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petId=" + petId +
                ", petType='" + petType + '\'' +
                ", petPrice='" + petPrice + '\'' +
                ", userId='" + userId + '\'' +
                ", petTitle='" + petTitle + '\'' +
                ", petDesc='" + petDesc + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", petCity='" + petCity + '\'' +
                ", wx='" + wx + '\'' +
                ", phone='" + phone + '\'' +
                ", petName='" + petName + '\'' +
                ", petAge='" + petAge + '\'' +
                ", petGender='" + petGender + '\'' +
                ", petBreed='" + petBreed + '\'' +
                ", isVaccine='" + isVaccine + '\'' +
                ", user=" + user +
                '}';
    }
}