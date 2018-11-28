/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import com.cibt.web.entity.Student;
import com.cibt.web.service.StudentService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author anis
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        List<Student> students = studentService.fetchAll();
        model.addAttribute("students", students);
        return "index";
    }
    
    @GetMapping(path = "/about")
    @ResponseBody
    public String about(){
        return "<h1>About Us</h1>";
    }
}
