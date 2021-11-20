package com.example.firstapp.Controller;

import com.example.firstapp.Model.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(Department.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Department department;

    @BeforeEach
    void setUp() {
        department = Department.builder()
                .departmentName("Kumar")
                .departmentCode("AMD")
                .departmentAddress("Ahemadabad")
                .departmentId(1L)
                .build();
    }

    @Test
    void saveDepartment() {

        Department imputdepartment = Department.builder()
                .departmentName("Kumar")
                .departmentCode("AMD")
                .departmentAddress("Ahemadabad")
                .build();

        Mockito.when(departmentService)
    }

    @Test
    void fetchDepartmentById() {
    }
}