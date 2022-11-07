package testing.demo.dto;


import lombok.Builder;

@Builder
public class StudentDto {
    private Long StudentId;
    // @JoinColumns()
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
