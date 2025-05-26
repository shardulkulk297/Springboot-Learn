package com.springboot.lms.repository;

import com.springboot.lms.model.Learner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnerRepository extends JpaRepository<Learner, Integer> {

}
