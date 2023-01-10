package com.springboot.mongodb.crud.service;

import com.springboot.mongodb.crud.entity.Student;
import com.springboot.mongodb.crud.model.StudentResponse;

public interface StudentService {
    StudentResponse getAllStudents();

    StudentResponse addStudent(Student student);

    StudentResponse removeStudent(Student student);

    StudentResponse updateStudent(Student student);
}
