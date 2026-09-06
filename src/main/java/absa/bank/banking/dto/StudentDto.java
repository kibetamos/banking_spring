package absa.bank.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class StudentDto {
    private Long id;
    private String firstName;
    private String secondName;
    private String course;
    private Double feeBalance;


}
