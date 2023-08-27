package com.example.demo.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.ResultsPrimaryKey;
import com.example.demo.Entity.Results_db;

@Repository
public interface ResultsRepo extends JpaRepository<Results_db, ResultsPrimaryKey> 
{
	@Query(value = "SELECT * FROM results_db WHERE reg_no = :reg_no", nativeQuery = true)
	List<Results_db> findByRegNo(@Param("reg_no") long reg_no);
}
