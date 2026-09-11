package absa.bank.banking.service.impl;

import absa.bank.banking.dto.StudentDto;
import absa.bank.banking.entity.Account;
import absa.bank.banking.entity.Student;
import absa.bank.banking.mapper.AccountMapper;
import absa.bank.banking.mapper.StudentMapper;
import absa.bank.banking.repository.StudentRepository;
import absa.bank.banking.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
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

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students
                .stream()
                .map((student) -> StudentMapper
                        .mapToStudentDto(student))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto payFees(Long id, double amount) {
        Student student = studentRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Student Does not Exist"));

        double total = student.getFeeBalance() - amount;
        student.setFeeBalance(total);
        Student savedStudent = studentRepository.save(student);

        return StudentMapper.mapToStudentDto(savedStudent);


    }


}
