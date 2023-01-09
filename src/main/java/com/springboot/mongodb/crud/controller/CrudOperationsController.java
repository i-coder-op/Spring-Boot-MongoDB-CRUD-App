package com.springboot.mongodb.crud.controller;

import com.springboot.mongodb.crud.entity.Student;
import com.springboot.mongodb.crud.model.StudentResponse;
import com.springboot.mongodb.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is a controller class which handle all the rest calls from the client application
 */
@RestController
public class CrudOperationsController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/students", produces = "application/json")
    public ResponseEntity<StudentResponse> getAllStudents(){
        StudentResponse  studentResponse = studentService.getAllStudents();
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }

    @PostMapping(value = "/add/student", consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentResponse> addStudent(@RequestBody Student student){
        StudentResponse studentResponse = studentService.addStudent(student);
        return new ResponseEntity<>(studentResponse, HttpStatus.CREATED);
    }
}
