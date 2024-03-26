package com.example.demo.student;

import com.example.demo.student.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student raed = new Student(
                    "Raed",
                    "ghodhbane.raed@gmail.com",
                    LocalDate.of(1995, AUGUST, 9)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, AUGUST, 9)
            );

            repository.saveAll(
                    List.of(raed, alex)
            );
        };
    }
}
