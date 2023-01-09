package com.springboot.mongodb.crud.model;

import com.springboot.mongodb.crud.entity.Student;

import java.util.List;

public class StudentResponse {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
