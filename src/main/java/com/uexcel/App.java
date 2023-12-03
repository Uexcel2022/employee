package com.uexcel;

import org.hibernate.jpa.HibernatePersistenceProvider;

import com.uexcel.entity.Employee;
import com.uexcel.persistence.CustomPersistenceUnitInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
// import jakarta.persistence.Persistence;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        // EntityManagerFactory entityManagerFactory =
        // Persistence.createEntityManagerFactory("my-persistence-unit");

        // I PREFERE XML METHOD

        EntityManagerFactory entityManagerFactory = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(
                        new CustomPersistenceUnitInfo(),
                        new HashMap<>());

        EntityManager entityManager = entityManagerFactory.createEntityManager(); // It represents the context

        try {
            entityManager.getTransaction().begin();
            // entityManager.persist(new Employee(2L, "Jide", "")); //Creating new object

            // Employee emp = entityManager.find(Employee.class, 1);
            // emp.setAddress("1st Ave,F Close House 4, Festac Town"); //update up
            // System.out.println(emp);

            entityManager.merge(new Employee(2L, "Jide", "23 Owo, Lagos-Ibadan Express way"));
            // update - going merge the new object with its record in the date base.

            entityManager.getTransaction().commit();
        } catch (Exception e) {

        } finally {
            entityManager.close();
        }

    }
}
