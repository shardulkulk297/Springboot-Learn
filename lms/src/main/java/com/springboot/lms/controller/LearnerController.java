package com.springboot.lms.controller;

import com.springboot.lms.model.Learner;
import com.springboot.lms.service.LearnerService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LearnerController {

    @Autowired
    private LearnerService learnerService;


    @GetMapping("api/learner/HelloRestApi")
    public String helloRest(){
        return "Hello Rest API";
    }

    @PostMapping("/api/learner/add")
    public Learner insertLearner(@RequestBody Learner learner){
        return learnerService.insertLearner(learner);
    }

    @GetMapping("/api/learner/getAll")
    public List<Learner> getAllLearners(){
        return learnerService.getAllLearners();
    }

    @DeleteMapping("/api/learner/delete/{id}")
    public void deleteLearnerById(@PathVariable int id){
        learnerService.deleteLearnerById(id);
    }

    @GetMapping("/api/learner/getById/{id}")
    public Learner getLearnerById(@PathVariable int id){
        return learnerService.getLearnerById(id);
    }

    @PutMapping("/api/learner/updateById/{id}")
    public Learner updateLearnerById(@PathVariable int id, @RequestBody Learner updatedLearner){
        return learnerService.updateLearnerById(id, updatedLearner);
    }

}
