package com.amaravathi.college.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amaravathi.college.enetites.StudentDeatils;

@Repository

public interface studentsdao extends CrudRepository<StudentDeatils ,Long> {
	public List<StudentDeatils> nameBydep(String dep);



}
