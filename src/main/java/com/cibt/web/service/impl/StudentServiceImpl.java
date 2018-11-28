/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.service.impl;

import com.cibt.web.dao.StudentDao;
import com.cibt.web.entity.Student;
import com.cibt.web.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anis
 */
@Service(value = "studentService")
public class StudentServiceImpl implements StudentService{
    
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> fetchAll() {
        return studentDao.getAll();
    }
    
}
