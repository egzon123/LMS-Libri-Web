/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.controller;

import com.lms.LMSLibriWeb.model.Course;
//import com.lms.LMSLibriWeb.model.Files;
import com.lms.LMSLibriWeb.service.CourseService;
//import com.lms.LMSLibriWeb.service.FileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Egzon
 */
@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    CourseService courseService;
//       @Autowired
//       FileService fileService;

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
        ModelAndView model = new ModelAndView("admin_home");
        return model;
    }

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public ModelAndView courseList() {
        ModelAndView model = new ModelAndView("admin_courses_list");
        List<Course> courseList = courseService.getAllCourses();
        model.addObject("courseList", courseList);

        return model;
    }

//    @RequestMapping(value = "/files", method = RequestMethod.GET)
//    public ModelAndView courseFiles() {
//        ModelAndView model = new ModelAndView("admin_course_files");
//        List<Files> courseFiles = fileService.getAllFiles();
//        model.addObject("courseFiles", courseFiles);
//
//        return model;
//    }
}
