package com.student.example.dto;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class ClassDTO {
    private Long id;
    @NotBlank(message = "Class Name is required")
    private String name;
    private List<StudentDTO> students = new ArrayList<>();
}
