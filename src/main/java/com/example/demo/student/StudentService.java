package com.example.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Yasith",
                        20,
                        "yasithiduvara@gmail.com",
                        LocalDate.of(2003, Month.DECEMBER, 22)

                )
        );
    }
}
