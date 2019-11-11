/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.service;

import com.lms.LMSLibriWeb.model.Users;
import com.lms.LMSLibriWeb.repository.UserRepository;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Egzon
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
   
    @Autowired
    UserRepository userRepository;

 @Override
 public List<Users> getAllUsers() {
  return (List<Users>) userRepository.findAll();
 }

 @Override
 public Users getUserById(int  id) {
  return userRepository.findById(id).get();
 }

 @Override
 public void saveOrUpdate(Users user) {
  userRepository.save(user);
 }

 @Override
 public void deleteUser(int id) {
  userRepository.deleteById(id);
 }
}
