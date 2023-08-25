package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String>
{

}
