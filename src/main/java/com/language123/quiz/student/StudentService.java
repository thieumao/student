package com.language123.quiz.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {

	public List<Student> getStudents() {
		return List.of(
				new Student(1L, "Mao", "thieumao@gmail.com",
						LocalDate.of(1992, Month.JULY, 13), 30),
				new Student(2L, "Ha", "thu96ha@gmail.com",
						LocalDate.of(1996, Month.NOVEMBER, 6), 26)
		);
	}
}
