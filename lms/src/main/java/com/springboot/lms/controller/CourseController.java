package com.springboot.lms.controller;

import com.springboot.lms.model.Course;
import com.springboot.lms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;



    @PostMapping("/add")
    public void postCourse(@RequestBody Course course){
        courseService.postCourse(course);
    }

    @GetMapping("/getById/{id}")
    public Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

}
