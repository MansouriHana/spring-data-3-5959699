package com.hm.university.dao;

import com.hm.university.business.UniversityService;
import com.hm.university.domain.Student;

/**
 * Testing Helper class that initializes the database with a seeded
 * set of students, staff, courses and deparments
 */
class UniversityFactory {

    public static void fillUniversity(UniversityService service) {
        service.deleteAll();
        System.out.println("Number of courses = " + service.findAllCourses().size());
        boolean fullTime = true;
        Student jane = service.createStudent("jane", "Doe", fullTime, 20);
        Student john = service.createStudent("john", "Doe", fullTime, 22);
        Student mike = service.createStudent("mike", "Smith", fullTime, 18);
        Student ally = service.createStudent("ally", "Kim", !fullTime, 19);
    }
}