package com.language123.quiz.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	@GetMapping(value = "/")
	public List<Student> getStudents() {
		return List.of(
				new Student(1L, "Mao", "thieumao@gmail.com",
						LocalDate.of(1992, Month.JULY, 13), 30),
				new Student(2L, "Ha", "thu96ha@gmail.com",
						LocalDate.of(1996, Month.NOVEMBER, 6), 26)
		);
	}
}
