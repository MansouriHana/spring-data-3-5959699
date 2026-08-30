package com.hm.university.repo;

import com.hm.university.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer > {

     Optional<Course> findByName(String name);

     List<Course> findByDepartmentChairMemberLastName(String chair) ;

     List<Course> findByPrerequisites(Course course) ;

     List<Course> findByCredits(int credits) ;
}
