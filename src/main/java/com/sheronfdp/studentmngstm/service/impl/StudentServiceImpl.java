package com.sheronfdp.studentmngstm.service.impl;

import com.sheronfdp.studentmngstm.entity.Student;
import com.sheronfdp.studentmngstm.repository.StudentRepository;
import com.sheronfdp.studentmngstm.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
