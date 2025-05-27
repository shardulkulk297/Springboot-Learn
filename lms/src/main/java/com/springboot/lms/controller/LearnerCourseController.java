package com.springboot.lms.controller;

import com.springboot.lms.model.LearnerCourse;
import com.springboot.lms.repository.LearnerCourseRepository;
import com.springboot.lms.service.LearnerCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnerCourseController {

    @Autowired
    private LearnerCourseService learnerCourseService;

    @PostMapping ("/api/learner/enroll/course/{learnerId}/{courseId}")
    public LearnerCourse enrollLearnerInCourse(@PathVariable int learnerId, @PathVariable int courseId,  @RequestBody LearnerCourse learnerCourse){
        return learnerCourseService.enrollLearnerInCourse(learnerId, courseId, learnerCourse);
    }


}
