package com.hibernate.main.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.hibernate.main.model.Learner;
import com.hibernate.main.service.LearnerService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LearnerRepository {

   
	
	@PersistenceContext
	EntityManager eManager;

   
	public void insert(Learner learner) {
			eManager.persist(learner);	
	}
	
	public List<Learner> getAll(){
	    return eManager.createQuery("FROM Learner", Learner.class).getResultList();
	}
	
	public Learner getLearnerById(int id) {
		
		return eManager.find(Learner.class, id);
		
	}
	
	public void deleteLearnerById(int id) {
		eManager.remove(getLearnerById(id));
	}
	
	public void update(Learner learner) {
		eManager.merge(learner);
	}
}
