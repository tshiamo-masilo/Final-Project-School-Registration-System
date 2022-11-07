package testing.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class StudentDto {
    private Long StudentId;
    private String School_id;
    private String Student_id;
    private String Class_id;
    private String grade;
    private String Stream_id;
    private String Name;
    private String surname;
    private String Phone_Number;
}
//================DTO documentation==================
//https://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application
