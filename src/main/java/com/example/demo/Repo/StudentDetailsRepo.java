package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.StudentDetails;

@Repository
public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Long> 
{

}
