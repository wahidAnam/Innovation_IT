package com.example.innovationit.model;

public class OurTeam {

    int employeeImageIV;
    String nameTV,postNameTV,educationTV,phoneNumberTV;

    public OurTeam(int employeeImageIV, String nameTV, String postNameTV, String educationTV, String phoneNumberTV) {
        this.employeeImageIV = employeeImageIV;
        this.nameTV = nameTV;
        this.postNameTV = postNameTV;
        this.educationTV = educationTV;
        this.phoneNumberTV = phoneNumberTV;
    }

    public int getEmployeeImageIV() {
        return employeeImageIV;
    }

    public void setEmployeeImageIV(int employeeImageIV) {
        this.employeeImageIV = employeeImageIV;
    }

    public String getNameTV() {
        return nameTV;
    }

    public void setNameTV(String nameTV) {
        this.nameTV = nameTV;
    }

    public String getPostNameTV() {
        return postNameTV;
    }

    public void setPostNameTV(String postNameTV) {
        this.postNameTV = postNameTV;
    }

    public String getEducationTV() {
        return educationTV;
    }

    public void setEducationTV(String educationTV) {
        this.educationTV = educationTV;
    }

    public String getPhoneNumberTV() {
        return phoneNumberTV;
    }

    public void setPhoneNumberTV(String phoneNumberTV) {
        this.phoneNumberTV = phoneNumberTV;
    }
}
