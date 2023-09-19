package com.example.myproject.service;

import com.example.myproject.model.Student;
import com.example.myproject.repository.StudentJpaRepository;
import com.example.myproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements StudentRepository {

    @Autowired
    private StudentJpaRepository studentJpaRepository;
    @Override
    public ArrayList<Student> getStudents() {
        List<Student> studentList = studentJpaRepository.findAll();
        ArrayList<Student> students = new ArrayList<>(studentList);
        return students;
    }

    @Override
    public Student addStudent(Student student) {
        studentJpaRepository.save(student);
        return student;
    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }

    @Override
    public Student updateStudent(Student student, int studentId) {
        return null;
    }

    @Override
    public ArrayList<Student> deleteStudent(int studentId) {
        return null;
    }
}
