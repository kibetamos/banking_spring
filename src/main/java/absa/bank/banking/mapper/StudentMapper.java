package absa.bank.banking.mapper;

import absa.bank.banking.dto.StudentDto;
import absa.bank.banking.entity.Student;

public class StudentMapper {

    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getSecondName(),
                studentDto.getCourse(),
                studentDto.getFeeBalance()


        );
        return student;
    }


    public static StudentDto mapToStudentDto(Student Student){
//        studentDto
        StudentDto studentDto = new StudentDto(
                Student.getId(),
                Student.getFirstName(),
                Student.getSecondName(),
                Student.getCourse(),
                Student.getFeeBalance()

        );
        return studentDto;
    }
}
