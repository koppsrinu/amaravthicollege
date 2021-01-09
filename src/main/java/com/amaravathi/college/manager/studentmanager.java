package com.amaravathi.college.manager;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaravathi.college.dao.studentsdao;
import com.amaravathi.college.enetites.StudentDeatils;

@Service

public class studentmanager {
	
	@Autowired
	private studentsdao studentdao;
	public List<StudentDeatils> getStudents(){
		List<StudentDeatils> student = (List<StudentDeatils>) studentdao.findAll();
		return student;
		
	}
	public StudentDeatils createStudent(StudentDeatils student) {
		student=studentdao.save(student);
		return student;
		
	}
	public List<StudentDeatils> getDeps(String dep) {
		
		
		if(dep!=null) {
			List<StudentDeatils> studentbydep = studentdao.nameBydep(dep);
			if(studentbydep!=null) {
				List<StudentDeatils> students = (List<StudentDeatils>) studentdao.findAll();
			    return students;
			}
		}
		
		return null;
		
}
	public String updateStudent(StudentDeatils student) {
		if(student!=null && student.getId()!=0) {
			 Optional<StudentDeatils> optionalstudent = studentdao.findById((long) student.getId());
			 if(optionalstudent!=null && optionalstudent.isPresent()) {
				 StudentDeatils students = optionalstudent.get();
				 if(students.getName()!=null&& students.getName().isEmpty()) {
					 students.setName(students.getName());
					 
					 
				 }
				 
				 if(students.getDep()!=null && students.getDep().isEmpty()) {
					students.setDep(students.getDep());
		         }
			  StudentDeatils updatestudent =studentdao.save(students);
			 if(updatestudent!=null) {
				 return "updated ";
				 
			 }else {
				 return "not updated";
			 }
				 
			 }else {
				 return "details are not found";
			 }
		}
		return null;
		
	}

}
