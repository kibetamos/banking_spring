package absa.bank.banking.service.impl;

import absa.bank.banking.dto.StudentDto;
import absa.bank.banking.entity.Student;
import absa.bank.banking.mapper.StudentMapper;
import absa.bank.banking.repository.StudentRepository;
import absa.bank.banking.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){


        this.studentRepository = studentRepository;
    }


    @Override
    public StudentDto createStudent(StudentDto studentDto) {
//        return null;
        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);

    }

    @Override
    public StudentDto getStudentById(Long id) {
//        return null;
        Student student = studentRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Student Does not Exist"));

        return StudentMapper.mapToStudentDto(student);

    }


}
