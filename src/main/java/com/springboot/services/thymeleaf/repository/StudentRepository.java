package com.springboot.services.thymeleaf.repository;

import java.util.List;

import com.springboot.services.thymeleaf.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository <Student, Long> {
    List<Student> findByName(String name);
}
