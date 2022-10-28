package com.language123.quiz.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student mao = new Student(1L, "Mao", "thieumao@gmail.com",
					LocalDate.of(1992, Month.JULY, 13), 30);
			Student ha = new Student(2L, "Ha", "thu96ha@gmail.com",
					LocalDate.of(1996, Month.NOVEMBER, 6), 26);
			studentRepository.saveAll(List.of(mao, ha));
		};
	}
}
