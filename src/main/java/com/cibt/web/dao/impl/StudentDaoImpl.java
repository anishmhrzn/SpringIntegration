/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.dao.impl;

import com.cibt.web.dao.StudentDao;
import com.cibt.web.entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anis
 */
@Repository(value = "studentDao")
public class StudentDaoImpl implements StudentDao{
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getAll() {
        return jdbcTemplate.query("select * from students", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setEmail(rs.getString("email"));
                student.setContactNo(rs.getString("contact_no"));
                student.setId(rs.getInt("id"));
                student.setStatus(rs.getBoolean("status"));
                return student;                
            }
        });
    }
    
}
