package com.hm.university.dao;

import com.hm.university.domain.Student;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
/**
 * Data Access Object Class for the Student Entity.
 * Uses only jakarta.persistence libraries.
 */
@Repository
public class StudentDao {
    EntityManager em;

    public StudentDao(EntityManagerFactory emf) {
        this.em = emf.createEntityManager();
    }

}
