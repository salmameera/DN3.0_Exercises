package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Derived query method to find employees by department name
    List<Employee> findByDepartmentName(String departmentName);

    // Derived query method to find employees by email
    Employee findByEmail(String email);
}
