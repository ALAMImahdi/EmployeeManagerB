package tech.getarrays.Employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.Employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
