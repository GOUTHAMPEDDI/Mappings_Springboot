package com.GouthamPeddi.Mappings.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;
    @ManyToMany
    @JoinTable(name = "fk_course_student",joinColumns = @JoinColumn(name ="fk_course_Id"),inverseJoinColumns = @JoinColumn(name = "fk_student_Id"))
    List<Student> students;

}