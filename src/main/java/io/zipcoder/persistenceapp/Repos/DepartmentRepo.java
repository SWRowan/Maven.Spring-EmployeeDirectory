package io.zipcoder.persistenceapp.Repos;

import io.zipcoder.persistenceapp.Entities.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {
}
