package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Results;
import com.example.demo.Entity.Semester_1;

public interface Sem1ResultsRepo extends JpaRepository<Semester_1, Long>
{
	
}
