/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.service;

import com.lms.LMSLibriWeb.model.Users;

import java.util.List;
/**
 *
 * @author Egzon
 */
public interface UserService {

public List<Users> getAllUsers();
 
 public Users getUserById(int id);
 
 public void saveOrUpdate(Users user);
 
 public void deleteUser(int id);
}
