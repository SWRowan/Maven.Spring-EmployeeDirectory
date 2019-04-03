package io.zipcoder.persistenceapp.Controllers;

import io.zipcoder.persistenceapp.Entities.Department;
import io.zipcoder.persistenceapp.Entities.Employee;
import io.zipcoder.persistenceapp.Repos.DepartmentRepo;
import io.zipcoder.persistenceapp.Repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeDirectoryController {
    DepartmentRepo departmentRepo;
    EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeDirectoryController(DepartmentRepo departmentRepo, EmployeeRepo employeeRepo) {
        this.departmentRepo = departmentRepo;
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/directory/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
        return new ResponseEntity<>(employeeRepo.findOne(id), HttpStatus.OK);
    }

    @GetMapping("/directory/department/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Integer id){
        return new ResponseEntity<>(departmentRepo.findOne(id), HttpStatus.OK);
    }

    @PostMapping("/directory/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeRepo.save(employee), HttpStatus.CREATED);
    }

    @PostMapping("/directory/department")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        return new ResponseEntity<>(departmentRepo.save(department), HttpStatus.CREATED);
    }

    @PutMapping("/directory/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee e = new Employee();
        e.setDeptNumber(employee.getDeptNumber());
        e.setFirstName(employee.getFirstName());
        e.setLastName(employee.getLastName());
        e.setHireDate(employee.getHireDate());
        e.setEmail(employee.getEmail());
        e.setPhoneNumber(employee.getPhoneNumber());
        e.setManager(employee.getManager());
        return new ResponseEntity<>(employeeRepo.save(e), HttpStatus.OK);
    }

    @PutMapping("/directory/department")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department){
        Department d = new Department();
        d.setDeptName(department.getDeptName());
        d.setManagerId(department.getManagerId());
        return new ResponseEntity<>(departmentRepo.save(d), HttpStatus.OK);
    }

    @DeleteMapping("/directory/employee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        employeeRepo.delete(id);
    }

    @DeleteMapping("/directory/department/{id}")
    public void deleteDepartment(@PathVariable Integer id){
        departmentRepo.delete(id);
    }


}
