package com.test1.jpa_exercise.get_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.List;

@Repository
public class getDemoRepository {

    EntityManager entityManager;

    @Autowired
    getDemoRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public List<users> findUsers(){
        TypedQuery<users> result =  entityManager.createQuery("SELECT u FROM users u", users.class);
        return result.getResultList();
    }

    public void save(users user){
        entityManager.persist(user);
    }
}
