package com.abheet.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abheet.sm.DAO.StudentDAO;
import com.abheet.sm.api.Student;
import com.abheet.sm.api.StudentDTO;
import com.abheet.sm.service.StudentService;

@Controller
public class StudentControllers {

	@Autowired
	private StudentDAO StudentDao;

	@Autowired
	private StudentService studentService;
	
	// @RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {

		List<Student> list = studentService.loadStudents();

		model.addAttribute("students", list);
	
		for(Student temp : list)
			System.out.println(temp);

		return "student-list";
	}
	
	@GetMapping("/showAddStudentPage")
	public String showAddStudentPage(Model model)
	{
		StudentDTO studentdto=new StudentDTO();
		
		model.addAttribute("students", studentdto);
		
		return "addstudent";
	}
	
	//@ResponseBody
	@PostMapping("/save-student")
	public String saveStudent(StudentDTO studentdto)
	{
		
		studentService.saveStudents(studentdto);
		//System.out.println(studentdto);
		//showStudentList();
		return "redirect:/showStudent";
	}
	@ResponseBody
	@GetMapping("/thankYou")
	public String thankYou()
	{
		return "ur data has been saved";
		//System.out.println("ur data has been saved");
	}

}
