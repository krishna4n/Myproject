package com.example.myproject.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
    private int studentId;

    @Column(name = "studentname")
    private String studentName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "studentclass")
    private int studentClass;

    public Student(){}

    public Student(int studentId, String studentName, String gender, int studentClass){
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.studentClass = studentClass;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public int getStudentClass(){
        return this.studentClass;
    }

    public void setStudentClass(int studentClass){
        this.studentClass = studentClass;
    }
}
