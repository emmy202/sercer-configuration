package com.aos.mywebapp.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import java.util.Date;

public class Support {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supportId;
    private Integer supportAmount;
    private Date supportDate;
    @ManyToOne
    private Applicant applicant;

    public Integer getSupportId() {
        return supportId;
    }

    public void setSupportId(Integer supportId) {
        this.supportId = supportId;
    }

    public Integer getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(Integer supportAmount) {
        this.supportAmount = supportAmount;
    }

    public Date getSupportDate() {
        return supportDate;
    }

    public void setSupportDate(Date supportDate) {
        this.supportDate = supportDate;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public String toString() {
        return "Support{" +
                "supportId=" + supportId +
                ", supportAmount=" + supportAmount +
                ", supportDate=" + supportDate +
                ", applicant=" + applicant +
                '}';
    }
}
