package absa.bank.banking.service;

import absa.bank.banking.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    StudentDto getStudentById(Long id);
//    StudentDto

}
