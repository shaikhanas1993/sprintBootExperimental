package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}