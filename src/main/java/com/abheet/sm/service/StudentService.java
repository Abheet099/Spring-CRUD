package com.abheet.sm.service;

import java.util.List;

import com.abheet.sm.api.Student;
import com.abheet.sm.api.StudentDTO;

public interface StudentService {

	public List<Student> loadStudents();

	public void saveStudents(StudentDTO studentdto);
}
