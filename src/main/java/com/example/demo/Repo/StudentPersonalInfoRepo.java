package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.StudentPersonalInfo;

public interface StudentPersonalInfoRepo extends JpaRepository<StudentPersonalInfo, Long>
{
	
}
