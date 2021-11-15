package com.example.firstapp.Controller;

import com.example.firstapp.Model.Course;
import org.springframework.web.bind.annotation.*;

@RestController
public class firstController {

    @RequestMapping("/course")
    public Course getEndPoint(@RequestParam(value = "name", defaultValue = "deekshith", required = false) String name,
                              @RequestParam(value = "chapterCount", defaultValue = "2", required = false) int chapterCount) {

        return new Course(name, chapterCount);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register/course")
    public String saveCourse(@RequestBody Course course){
        return "Your course named " + course.getName() + " with " +  course.getChapterCount() + " chapters saved successfully";
    }
}
