package com.language123.quiz.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	private final StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping(value = "/")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@PostMapping(value = "/")
	public void registerNewStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
	}

	@DeleteMapping(value = "/{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId) {
		studentService.deleteStudent(studentId);
	}

	@PutMapping(value = "/{studentId}")
	public void updateStudent(
			@PathVariable("studentId") Long studentId,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String email) {
		studentService.updateStudent(studentId, name, email);
	}
}
