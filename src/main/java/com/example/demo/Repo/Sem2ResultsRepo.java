package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Semester_2;

@Repository
public interface Sem2ResultsRepo extends JpaRepository<Semester_2, Long>
{

}
