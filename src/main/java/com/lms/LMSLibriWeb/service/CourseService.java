/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.service;

import com.lms.LMSLibriWeb.model.Course;
import com.lms.LMSLibriWeb.model.Users;
import java.util.List;

/**
 *
 * @author Egzon
 */
public interface CourseService {
    public List<Course> getAllCourses();
 
 public Course getCourseById(int id);
 
 public void saveOrUpdate(Course course);
 
 public void deleteCourse(int id);
}
