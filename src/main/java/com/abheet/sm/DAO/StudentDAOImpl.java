package com.abheet.sm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abheet.sm.api.Student;
import com.abheet.sm.api.StudentDTO;
import com.abheet.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	JdbcTemplate JDBCTemplate;
	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		//List<Student> student = new ArrayList<Student>();
		
		//data access logic 
		String sql="SELECT * FROM students";
		
		List<Student> query = JDBCTemplate.query(sql,new StudentRowMapper());
		
		
		return query;
	}
	@Override
	public void saveStudents(StudentDTO student) {
		// TODO Auto-generated method stub
		Object[] data= {student.getName(),student.getMobile(),student.getCountry()};
		String sql = "INSERT INTO students (name,mobile,country) VALUES(?,?,?)";
		
		JDBCTemplate.update(sql, data);
		
		System.out.println("1 record updated ");
		
		
		
	}
	
	

}
