package net.huizha.examples.restclient.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RestApiExampleEmployee {
    private String profileImage;
    private String employeeName;
    private int employeeSalary;
    private int id;
    private int employeeAge;

    @JsonGetter("profile_image")
    public String getProfileImage() {
        return profileImage;
    }

    @JsonSetter("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @JsonGetter("employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    @JsonSetter("employee_name")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @JsonGetter("employee_salary")
    public int getEmployeeSalary() {
        return employeeSalary;
    }

    @JsonSetter("employee_salary")
    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @JsonGetter("id")
    public int getId() {
        return id;
    }

    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonGetter("employee_age")
    public int getEmployeeAge() {
        return employeeAge;
    }

    @JsonSetter("employee_age")
    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }


}
