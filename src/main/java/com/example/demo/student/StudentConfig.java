package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration

public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yasith = new Student(
                    "Yasith",
                    "yasithiduvara@gmail.com",
                    LocalDate.of(2003, Month.DECEMBER, 22)

            );
            Student hashan = new Student(
                    "Hashan",
                    "hashanx@gmail.com",
                    LocalDate.of(1999, Month.NOVEMBER.firstMonthOfQuarter(), 9)

            );

            repository.saveAll(
                    List.of(yasith,hashan,vidath)
            );
        };
    }
}
