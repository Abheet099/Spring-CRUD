package com.abheet.sm.DAO;

import java.util.List;

import com.abheet.sm.api.Student;
import com.abheet.sm.api.StudentDTO;

public interface StudentDAO {
	
	List<Student> loadStudents();
	
	void saveStudents(StudentDTO student);

}
