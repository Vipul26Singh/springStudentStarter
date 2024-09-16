package com.student.example.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class StudentDTO {
    private Long id;
    @NotBlank(message = "Student Name is required")
    @Size(min = 2, max = 70, message = "Length of name should be between 2 and 70")
    private String name;

    @NotBlank(message = "City Name is required")
    @Size(min = 2, max = 40, message = "Length of name should be between 2 and 40")
    private String city;

    @NotBlank(message = "Roll number is required")
    @Positive(message = "Invalid roll number")
    @Max(value = 100, message = "Roll number can not be greater than 100")
    private Long rollNumber;

    @NotBlank(message = "Class is required")
    private ClassDTO studentClass;

    private Long userId;
}
