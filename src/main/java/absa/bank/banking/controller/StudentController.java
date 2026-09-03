package absa.bank.banking.controller;

import absa.bank.banking.dto.StudentDto;
import absa.bank.banking.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController


@RequestMapping("/api/studentrs")
public class StudentController {


    private StudentService studentService;


    public StudentController(StudentService studentService){
        this.studentService = studentService;

    }

    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
        return new ResponseEntity<>(
                studentService.
                createStudent(studentDto),
                HttpStatus.CREATED);
    }

    //get student by id
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
        StudentDto studentDto = studentService.getStudentById(id);
        return ResponseEntity.ok(studentDto);
}


}
