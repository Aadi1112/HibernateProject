package com.Hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hibernate.enity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
