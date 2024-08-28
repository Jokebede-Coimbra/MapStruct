package com.mapstruct.demo.mapementocolecoes.application;

import com.mapstruct.demo.mapementocolecoes.dto.EmployeeDTO;
import com.mapstruct.demo.mapementocolecoes.entities.Employee;
import com.mapstruct.demo.mapementocolecoes.mapper.EmployeeMapper;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;
import java.util.List;

public class program {

    public static void main(String[] args) {

        // Criar alguns empregados
        Employee emp1 = new Employee(1L, "John Doe", "IT");
        Employee emp2 = new Employee(2L, "Jane Smith", "HR");
        Employee emp3 = new Employee(3L, "Mike Johnson", "Finance");

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3);

        // Obter uma instância do mapeador
        EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

        // Mapear a lista de empregados para DTOs
        List<EmployeeDTO> employeeDTOs = mapper.employeesToEmployeeDTOs(employees);

        System.out.println("Empregados originais:");
        for (Employee emp : employees) {
            System.out.println(emp.getId() + ": " + emp.getName() + " - " + emp.getDepartment());
        }

        System.out.println("\nEmpregados mapeados para DTOs:");
        for (EmployeeDTO dto : employeeDTOs) {
            System.out.println(dto);
        }
    }
}

