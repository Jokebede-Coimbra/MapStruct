package com.mapstruct.demo.mapementocolecoes.mapper;

import com.mapstruct.demo.mapementocolecoes.dto.EmployeeDTO;
import com.mapstruct.demo.mapementocolecoes.entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Mapping(source = "id", target = "employeeId")
    @Mapping(source = "name", target = "fullName")
    @Mapping(source = "department", target = "dept")
    EmployeeDTO employeeToEmployeeDTO(Employee employee);

    List<EmployeeDTO> employeesToEmployeeDTOs(List<Employee> employees);
}
