package com.abheet.sm.service;

import java.util.List;

import com.abheet.sm.api.Student;
import com.abheet.sm.api.StudentDTO;

public interface StudentService {

	public List<Student> loadStudents();

	public void saveStudents(StudentDTO studentdto);

	public StudentDTO getStudent(int id);

	public void updateStudents(StudentDTO studentdto);

	public void deleteStudent(int id);
}
