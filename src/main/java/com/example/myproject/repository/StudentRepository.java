package com.example.myproject.repository;

import com.example.myproject.model.Student;

import java.util.ArrayList;

public interface StudentRepository {

    ArrayList<Student> getStudents();

    Student addStudent(Student student);

    Student getStudentById(int studentId);

    Student updateStudent(Student student, int studentId);

    ArrayList<Student> deleteStudent(int studentId);
}
