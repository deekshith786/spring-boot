package com.example.firstapp.Controller;

import com.example.firstapp.Error.DepartmentNotFound;
import com.example.firstapp.Model.Department;
import com.example.firstapp.Service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    // using the spring @Autowired annotation to get the object which is already created by the spring when we declared the class
    // so we are not creating the object manually, spring is already providing it (this is called Dependency Injection)
    @Autowired
    private DepartmentService departmentService;

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOG.info("Inside the saveDepartment method");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getDepartments")
    public List<Department> fetchDepartmentList(){
        LOG.info("Inside the fetchDepartmentList method");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/getUserById/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFound {
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

    @GetMapping("/findepartmentByName/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
