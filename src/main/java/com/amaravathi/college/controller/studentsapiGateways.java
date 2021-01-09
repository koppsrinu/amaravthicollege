package com.amaravathi.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amaravathi.college.enetites.StudentDeatils;
import com.amaravathi.college.manager.studentmanager;



@RestController
public class studentsapiGateways {
	@Autowired
    private studentmanager studentManager;	
	
	@GetMapping("/get")
	public List<StudentDeatils> getStudents(){
		List<StudentDeatils> student = studentManager.getStudents();
		return student;
		
	}
	
	@GetMapping("/get/{dep}")
	public List<StudentDeatils> getDep(@PathVariable("dep")String dep) {
		List<StudentDeatils> student = studentManager.getDeps(dep);
		return student;
		
	}
	
	
	@PostMapping("/get/create")
    public StudentDeatils createStudent(StudentDeatils student) {
		student = studentManager.createStudent(student);
		return student;
    	
    }
	@PutMapping("/get/create/update")
	public String updateStudent(StudentDeatils student) {
		return studentManager.updateStudent(student);
		
	}
}
