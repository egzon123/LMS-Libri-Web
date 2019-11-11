/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.controller;

import com.lms.LMSLibriWeb.model.Users;
import com.lms.LMSLibriWeb.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Egzon
 */
@RestController
@RequestMapping(value="/user")
public class UserControllers {

 @Autowired
 UserService userService;
 
// @ResponseBody
// public String getHome() {
//	 return "awkdw";	
//	 
// }
 
@RequestMapping("/test")
@ResponseBody
    public String index() {
        return "aijdiw";
    }

 @RequestMapping(value="/list", method=RequestMethod.GET)
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("user_list");
  List<Users> usersList = userService.getAllUsers();
  model.addObject("userList", usersList);
  
  return model;
 }
 
 @RequestMapping(value="/addUser", method=RequestMethod.GET)
 public ModelAndView addUser() {
  ModelAndView model = new ModelAndView();
  
  Users user = new Users();
  model.addObject("userForm", user);
  model.setViewName("user_form");
  
  return model;
 }
 
 @RequestMapping(value="/updateUser/{id}", method=RequestMethod.GET)
 public ModelAndView editUser(@PathVariable int id) {
  ModelAndView model = new ModelAndView();
  
  Users user = userService.getUserById(id);
  model.addObject("userForm", user);
  model.setViewName("user_form");
  
  return model;
 }
 
 @RequestMapping(value="/saveUser", method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("userForm") Users user) {
  userService.saveOrUpdate(user);
  
  return new ModelAndView("redirect:/user/list");
 }
 
 @RequestMapping(value="/deleteUser/{id}", method=RequestMethod.GET)
 public ModelAndView delete(@PathVariable("id") int id) {
  userService.deleteUser(id);
  
  return new ModelAndView("redirect:/user/list");
 }
}