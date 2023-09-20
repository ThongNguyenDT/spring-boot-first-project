package com.my.learn.firsttime.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "thong",
                        "thong@gmail.com",
                        LocalDate.of(2000, Month.JUNE,25),
                        21)
        );
    }
}
