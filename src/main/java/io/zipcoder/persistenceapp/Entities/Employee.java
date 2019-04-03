package io.zipcoder.persistenceapp.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer employeeNumber;

    private String firstName;
    private String lastName;
    private String title;
    private String phoneNumber;
    private String email;
    private String hireDate;
    private Integer managerId;
    private Integer deptNumber;

    public Employee() {
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(Integer deptNumber) {
        this.deptNumber = deptNumber;
    }
}
