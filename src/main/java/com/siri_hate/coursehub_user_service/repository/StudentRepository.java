package com.siri_hate.coursehub_user_service.repository;

import com.siri_hate.coursehub_user_service.entity.user_content.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> { }

