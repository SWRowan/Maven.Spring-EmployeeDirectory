package io.zipcoder.persistenceapp.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private Integer deptNumber;

    private String deptName;
    private Integer managerId;

    public Department() {
    }

    public Integer getDeptNumber() {
        return deptNumber;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}
