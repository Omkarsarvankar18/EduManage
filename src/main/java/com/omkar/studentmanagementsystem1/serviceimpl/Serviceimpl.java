package com.omkar.studentmanagementsystem1.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkar.studentmanagementsystem1.entity.Student;
import com.omkar.studentmanagementsystem1.repository.StudentRepository;
import com.omkar.studentmanagementsystem1.service.StudentService;

@Service
public class Serviceimpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudent(int id) {
	studentRepository.deleteById(id);;
		
	}

}
