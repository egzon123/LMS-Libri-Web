/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.repository;

import com.lms.LMSLibriWeb.model.Users;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Egzon
 */
public interface UserRepository extends CrudRepository<Users, Integer>{
    
}
