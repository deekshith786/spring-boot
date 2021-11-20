package com.example.firstapp.Service;

import com.example.firstapp.Error.DepartmentNotFound;
import com.example.firstapp.Model.Department;
import com.example.firstapp.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFound {
        Optional<Department> department =
                departmentRepository.findById(departmentId);
        if(!department.isPresent()){
            throw new DepartmentNotFound("Department Not Avaiable.... ");
        }
        return department.get();
    }

    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    public Department updateDepartment(Long departmentId, Department department) {

        Department departmentObj = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName())&&!"".equalsIgnoreCase(department.getDepartmentName())){
            departmentObj.setDepartmentName(department.getDepartmentName());
        }
        else if(Objects.nonNull(department.getDepartmentCode())&&!"".equalsIgnoreCase(department.getDepartmentCode())){
            departmentObj.setDepartmentCode(department.getDepartmentCode());
        }
        else if(Objects.nonNull(department.getDepartmentAddress())&&!"".equalsIgnoreCase(department.getDepartmentAddress())){
            departmentObj.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(departmentObj);
    }

    public Department fetchDepartmentByName(String departmentName) {

        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
