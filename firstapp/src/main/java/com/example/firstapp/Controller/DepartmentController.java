package com.example.firstapp.Controller;

import com.example.firstapp.Model.Department;
import com.example.firstapp.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    // using the spring @Autowired annotation to get the object which is already created by the spring when we declared the class
    // so we are not creating the object manually, spring is already providing it (this is called Dependency Injection)
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getDepartments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/getUserById/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/deleteDepartmentById/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted successfully";
    }

    @PutMapping("/updateDepartment/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                    @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);

    }
}
