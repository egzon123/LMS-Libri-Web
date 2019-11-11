/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.repository;

import com.lms.LMSLibriWeb.model.Course;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Egzon
 */
public interface CourseRepository extends CrudRepository<Course, Integer>{
    
}
