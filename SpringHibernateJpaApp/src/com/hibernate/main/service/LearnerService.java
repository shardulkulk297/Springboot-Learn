package com.hibernate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.main.model.Learner;
import com.hibernate.main.repository.LearnerRepository;

@Service
public class LearnerService {
	
	private LearnerRepository learnerRepository;
	
	@Autowired
	public LearnerService(LearnerRepository learnerRepository) {
		this.learnerRepository = learnerRepository;
	}
	
	public void insert(String name, String email, String contact) {
		Learner learner = new Learner();
		learner.setName(name);
		learner.setEmail(email);
		learner.setContact(contact);
		
		learnerRepository.insert(learner);
		
	}
	
	public List<Learner> getAll(){
		return learnerRepository.getAll();
	}
	
	public Learner getLearnerById(int id) {
		
		return learnerRepository.getLearnerById(id);
		
	}
	
	public void deleteLearnerById(int id) {
		learnerRepository.deleteLearnerById(id);
	}
	public void update(int id,String name, String email, String contact) {
		Learner learner = new Learner();
		learner.setId(id);
		learner.setName(name);
		learner.setEmail(email);
		learner.setContact(contact);
		learnerRepository.update(learner);
	}
	
	
	

}
