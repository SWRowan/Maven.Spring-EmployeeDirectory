package io.zipcoder.persistenceapp.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private Integer deptNumber;

    private String deptName;
    private Integer managerId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employeeList;


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

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
