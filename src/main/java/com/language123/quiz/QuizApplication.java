package com.language123.quiz;

import com.language123.quiz.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@GetMapping(value = "/")
	public List<Student> hello() {
		return List.of(
				new Student(1L, "Mao", "thieumao@gmail.com",
						LocalDate.of(1992, Month.JULY, 13), 30),
				new Student(2L, "Ha", "thu96ha@gmail.com",
						LocalDate.of(1996, Month.NOVEMBER, 6), 26)
		);
	}

}
