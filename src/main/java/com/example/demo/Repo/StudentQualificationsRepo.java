package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.StudentQualifications;

public interface StudentQualificationsRepo extends JpaRepository<StudentQualifications, Long>
{

}
