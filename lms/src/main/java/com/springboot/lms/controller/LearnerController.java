package com.springboot.lms.controller;

import com.springboot.lms.model.Learner;
import com.springboot.lms.service.LearnerService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnerController {

    @Autowired
    private LearnerService learnerService;

    @PostMapping("/api/learner/add")
    public Learner insertLearner(@RequestBody Learner learner){
        return learnerService.insertLearner(learner);
    }

}
