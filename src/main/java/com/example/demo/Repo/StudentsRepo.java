package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Students;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Long>
{

}
