package com.sushil.LearningSpring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
      return args -> {
         Student Sushil =  new Student(
                  "Sushil",
                  "sushilmishra@gmail.com",
                  LocalDate.of(2000, JULY,5)
          );
          Student Alex =  new Student(
                  "Alex",
                  "Alex@gmail.com",
                  LocalDate.of(2004, JULY,5)
          );


          repository.saveAll(List.of(Sushil, Alex));
      };
    }
}
