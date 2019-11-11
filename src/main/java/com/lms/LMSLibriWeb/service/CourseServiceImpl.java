/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.service;

import com.lms.LMSLibriWeb.model.Course;
import com.lms.LMSLibriWeb.repository.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Egzon
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService{
     @Autowired
    CourseRepository courseRepository;

 @Override
 public List<Course> getAllCourses() {
  return (List<Course>) courseRepository.findAll();
 }

 @Override
 public Course getCourseById(int  id) {
  return courseRepository.findById(id).get();
 }

 @Override
 public void saveOrUpdate(Course course) {
  courseRepository.save(course);
 }

 @Override
 public void deleteCourse(int id) {
  courseRepository.deleteById(id);
 }
}
