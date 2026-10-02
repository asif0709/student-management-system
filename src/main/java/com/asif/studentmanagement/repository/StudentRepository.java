package com.asif.studentmanagement.repository;
import com.asif.studentmanagement.model.Student; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface StudentRepository extends JpaRepository<Student,Long>{ List<Student> findByNameContainingIgnoreCase(String name); }
