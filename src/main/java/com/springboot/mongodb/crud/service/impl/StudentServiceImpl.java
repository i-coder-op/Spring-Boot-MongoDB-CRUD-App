package com.springboot.mongodb.crud.service.impl;

import com.springboot.mongodb.crud.entity.Student;
import com.springboot.mongodb.crud.model.StudentResponse;
import com.springboot.mongodb.crud.repository.StudentRepository;
import com.springboot.mongodb.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentResponse getAllStudents() {
        List<Student> students = studentRepository.findAll();
        if(null != students && !students.isEmpty()){
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setStudents(students);
            return studentResponse;
        }
        return null;
    }

    @Override
    public StudentResponse addStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        if(null != savedStudent){
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setStudents(List.of(student));
            return studentResponse;
        }
        return null;
    }
}
