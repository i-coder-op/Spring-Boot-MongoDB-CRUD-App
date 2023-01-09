package com.springboot.mongodb.crud.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class StudentClass {

    @Field(name = "student_class_name")
    private String studentClassName;

    @Field(name = "student_class_section")
    private String studentClassSection;

    public String getStudentClassName() {
        return studentClassName;
    }

    public void setStudentClassName(String studentClassName) {
        this.studentClassName = studentClassName;
    }

    public String getStudentClassSection() {
        return studentClassSection;
    }

    public void setStudentClassSection(String studentClassSection) {
        this.studentClassSection = studentClassSection;
    }
}
