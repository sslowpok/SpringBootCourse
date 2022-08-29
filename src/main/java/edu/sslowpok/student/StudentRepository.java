package edu.sslowpok.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository /* cuz it responds for Database layer */
public interface StudentRepository
        extends JpaRepository<Student, Long> {
    Optional<Student> findStudentByEmail(String email);

}
