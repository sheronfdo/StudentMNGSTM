package com.sheronfdp.studentmngstm;

import com.sheronfdp.studentmngstm.entity.Student;
import com.sheronfdp.studentmngstm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMngstmApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentMngstmApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception{
        Student student1 = new Student("Ramesh", "FADATARE", "rasmesh@gmail,com");
        studentRepository.save(student1);

    }

}
