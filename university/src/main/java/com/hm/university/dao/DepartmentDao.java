package com.hm.university.dao;

import com.hm.university.domain.Department;
import org.springframework.stereotype.Repository;

import jakarta.persistence .EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
/**
 * Data Access Object Class for the Department Entity.
 * Uses only jakarta.persistence libraries.
 */

@Repository
public class DepartmentDao {

    private EntityManager em;
    public DepartmentDao(EntityManagerFactory emf) {
        this.em = emf.createEntityManager();
    }


}
