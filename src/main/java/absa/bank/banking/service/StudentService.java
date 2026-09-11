package absa.bank.banking.service;

import absa.bank.banking.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    StudentDto getStudentById(Long id);
//    StudentDto

//list all the students
    List<StudentDto> getAllStudents();

    // pay fees for student

    StudentDto payFees(Long id, double feeBalance);

}
