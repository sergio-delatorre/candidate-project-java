package com.zoomcare.candidatechallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zoomcare.candidatechallenge.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
