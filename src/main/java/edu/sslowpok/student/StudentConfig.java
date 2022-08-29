package edu.sslowpok.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

import static java.util.Calendar.AUGUST;

@Configuration
public class StudentConfig {

    /* inserts values to database */
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student alex = new Student(
                    1L,
                    "Alex",
                    LocalDate.of(2000, AUGUST, 5),
                    "alex@icloud.com"
            );
            Student tom = new Student(
                    "Tom",
                    LocalDate.of(2002, AUGUST, 8),
                    "tom@icloud.com"
            );
            repository.saveAll(Arrays.asList(alex, tom));
        };
    }

}
