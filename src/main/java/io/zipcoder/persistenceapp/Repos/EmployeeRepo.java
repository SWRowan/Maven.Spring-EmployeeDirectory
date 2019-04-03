package io.zipcoder.persistenceapp.Repos;

import io.zipcoder.persistenceapp.Entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
}
