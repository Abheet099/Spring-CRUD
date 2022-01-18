package com.abheet.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abheet.sm.DAO.StudentDAO;
import com.abheet.sm.api.Student;
import com.abheet.sm.api.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentdao; 
	
	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		
		List<Student> loadStudents = studentdao.loadStudents();
		
		return loadStudents	;
	}

	@Override
	public void saveStudents(StudentDTO studentdto) {
		// TODO Auto-generated method stub
			studentdao.saveStudents(studentdto);
		
	}

	@Override
	public StudentDTO getStudent(int id) {
		
		Student student=studentdao.getStudents(id);
		
		StudentDTO studentdto=new StudentDTO();
		studentdto.setId(student.getId());
		studentdto.setName(student.getName());
		studentdto.setMobile(student.getMobile());
		studentdto.setCountry(student.getCountry());
		
		return studentdto;
	}

	@Override
	public void updateStudents(StudentDTO studentdto) {
		// TODO Auto-generated method stub
		
		studentdao.updateStudents(studentdto);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentdao.deleteStudent(id);
		
	}
		
}
