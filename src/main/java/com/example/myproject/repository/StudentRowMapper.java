package com.example.myproject.repository;

import com.example.myproject.model.Student;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Student(
                rs.getInt("studentId"),
        rs.getString("studentName"),
        rs.getString("gender"),
        rs.getInt("studentClass")
        );

    }
}
