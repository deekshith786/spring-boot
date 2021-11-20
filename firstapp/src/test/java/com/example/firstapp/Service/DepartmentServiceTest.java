package com.example.firstapp.Service;

import com.example.firstapp.Model.Department;
import com.example.firstapp.Repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    public DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {

        Department department =
                Department.builder()
                        .departmentName("Deekshith")
                        .departmentAddress("Secundrabad")
                        .departmentCode("SEC")
                        .departmentId(3L)
                        .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("Deekshith"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("get the data based on valid Department Name")
    public void whenDepartmentNameValid_thenDepartmentShouldFound(){

        // we are giving here dummy names
        String departmentName = "Deekshith";
        //original name present in our code and DB
        Department found = departmentService.fetchDepartmentByName(departmentName);

        // checking if dummy and origina names matches then it is valid
        assertEquals(departmentName, found.getDepartmentName());

    }
}