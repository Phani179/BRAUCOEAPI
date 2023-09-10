package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.StudentDetails;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Long> 
{

}
