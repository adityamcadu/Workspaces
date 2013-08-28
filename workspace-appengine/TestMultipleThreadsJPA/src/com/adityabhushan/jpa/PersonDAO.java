package com.adityabhushan.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class PersonDAO extends GenericDAO {
	public void persisPerson(Person person) {
        EntityManager em = createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
 
        em.persist(person);
 
        tx.commit();
        em.close();
    }
 
    @SuppressWarnings("unchecked")
    public List<Person> getAllPersons() {
        EntityManager em = createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
 
        Query allPersonsQuery = em.createQuery("select d from Person d");
 
        List<Person> allPersons = allPersonsQuery.getResultList();
 
        tx.commit();
        em.close();
 
        return allPersons;
    }
}
