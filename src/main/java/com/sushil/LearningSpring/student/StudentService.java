package com.sushil.LearningSpring.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudent(){
        return List.of(new Student(
                1L,"Sushil",
                "sushilmishra@gmail.com",
                LocalDate.of(2000, Month.JULY,5),
                21
        ));
    }
}
