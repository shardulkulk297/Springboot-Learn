package com.springboot.lms.service;

import com.springboot.lms.exception.ResourceNotFoundException;
import com.springboot.lms.model.Course;
import com.springboot.lms.model.Learner;
import com.springboot.lms.model.LearnerCourse;
import com.springboot.lms.repository.CourseRepository;
import com.springboot.lms.repository.LearnerCourseRepository;
import com.springboot.lms.repository.LearnerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LearnerCourseService {

    private LearnerRepository learnerRepository;
    private CourseRepository courseRepository;
    private LearnerCourseRepository learnerCourseRepository;

    public LearnerCourseService(LearnerRepository learnerRepository, CourseRepository courseRepository,
     LearnerCourseRepository learnerCourseRepository){
        this.learnerRepository = learnerRepository;
        this.courseRepository = courseRepository;
        this.learnerCourseRepository = learnerCourseRepository;
    }

    public LearnerCourse enrollLearnerInCourse(int learnerId, int courseId, LearnerCourse learnerCourse)
    {

        /*
        1. First fetch learner by using id
        2. Fetch COurse using id
        3. Set todays date as enroll date
        4. Set the course and learner to LearnerCourse
        5. Call the save method and save to database
         */
        Learner learner =  learnerRepository.findById(learnerId).orElseThrow(()->new ResourceNotFoundException("Learner Not found"));
        Course course = courseRepository.findById(courseId).orElseThrow(()->new ResourceNotFoundException("Course Not found"));

        learnerCourse.setEnrollDate(LocalDate.now());
        learnerCourse.setCourse(course);
        learnerCourse.setLearner(learner);

        return learnerCourseRepository.save(learnerCourse);
    }




}
