package com.sheronfdp.studentmngstm.repository;

import com.sheronfdp.studentmngstm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
