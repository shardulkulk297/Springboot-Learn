package com.springboot.lms.repository;

import com.springboot.lms.model.LearnerCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnerCourseRepository extends JpaRepository<LearnerCourse, Integer> {

}
