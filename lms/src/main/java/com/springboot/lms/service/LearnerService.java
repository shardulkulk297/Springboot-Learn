package com.springboot.lms.service;

import com.springboot.lms.model.Learner;
import com.springboot.lms.repository.LearnerRepository;
import org.springframework.stereotype.Service;

@Service
public class LearnerService {

    private LearnerRepository learnerRepository;

    public LearnerService(LearnerRepository learnerRepository){
        this.learnerRepository = learnerRepository;
    }

    public Learner insertLearner(Learner learner){
        return learnerRepository.save(learner);
    }




}
