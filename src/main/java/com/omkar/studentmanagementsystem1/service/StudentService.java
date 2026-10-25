package com.omkar.studentmanagementsystem1.service;

import java.util.List;

import com.omkar.studentmanagementsystem1.entity.Student;


public interface StudentService {

	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student getById(int id);
	
	public void deleteStudent(int id);
}
