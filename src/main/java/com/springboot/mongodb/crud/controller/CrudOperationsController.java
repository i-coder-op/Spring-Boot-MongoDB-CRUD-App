package com.springboot.mongodb.crud.controller;

import com.springboot.mongodb.crud.entity.Student;
import com.springboot.mongodb.crud.model.StudentResponse;
import com.springboot.mongodb.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This is a controller class which handle all the rest calls from the client application
 */
@RestController
public class CrudOperationsController {

    @Autowired
    StudentService studentService;

    /**
     * Read all the data from the student collection from mongoDB
     * @return
     */
    @GetMapping(value = "/students", produces = "application/json")
    public ResponseEntity<StudentResponse> getAllStudents(){
        StudentResponse  studentResponse = studentService.getAllStudents();
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }

    /**
     * Create a new student document in the student collection
     * @param student
     * @return ResponseEntity<StudentResponse>
     */
    @PostMapping(value = "/add/student", consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentResponse> addStudent(@RequestBody Student student){
        StudentResponse studentResponse = studentService.addStudent(student);
        return new ResponseEntity<>(studentResponse, HttpStatus.CREATED);
    }

    /**
     * Delete an existing student document from the student collection
     * @param student
     * @return
     */
    @DeleteMapping(value = "/delete/student", consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentResponse> removeStudent(@RequestBody Student student){
        StudentResponse studentResponse = studentService.removeStudent(student);
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }

    /**
     * Update an existing document in the student collection
     * @param student
     * @return
     */
    @PostMapping(value = "/update/student", consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentResponse> updateStudent(@RequestBody Student student){
        StudentResponse studentResponse = studentService.updateStudent(student);
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }
}
