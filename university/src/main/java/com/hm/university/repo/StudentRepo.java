package com.hm.university.repo;

import com.hm.university.domain.Student;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByFullTime(boolean fullTime);

    List<Student> findByAge(Integer age) ;

    List<Student> findByAttendeeLastName(String lastName);

}
