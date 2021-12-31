package com.aos.mywebapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Applicant {
     @Id
    private String accNo;
    private String Gender;
    private String nationalId;
//    private String singleStatsCertificate;
//    private String wdaCertificate;
//    private String behaviourCertificate;
//    private String proposedProject;
    private String status = "pending";
    private String nameOfProject;
    private Double budgetOfProject;
    @ManyToOne
    private Sector sector;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    @OneToOne
    private User user;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public Double getBudgetOfProject() {
        return budgetOfProject;
    }

    public void setBudgetOfProject(Double budgetOfProject) {
        this.budgetOfProject = budgetOfProject;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public User getUser() {
        return user;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "accNo='" + accNo + '\'' +
                ", Gender='" + Gender + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", status='" + status + '\'' +
                ", nameOfProject='" + nameOfProject + '\'' +
                ", budgetOfProject=" + budgetOfProject +
                ", sector=" + sector +
                ", province=" + province +
                ", district=" + district +
                ", user=" + user +
                '}';
    }
}