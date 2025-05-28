package com.springboot.lms.repository;

import com.springboot.lms.model.LearnerCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LearnerCourseRepository extends JpaRepository<LearnerCourse, Integer> {


    @Query("select lc from LearnerCourse lc where lc.learner.id= ?1 AND lc.course.id=?2")
    Optional<LearnerCourse> getUsingJPQL(int learnerId, int courseId);

}
