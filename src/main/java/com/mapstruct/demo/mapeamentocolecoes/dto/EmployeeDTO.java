package com.mapstruct.demo.mapementocolecoes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeDTO {

    private Long employeeId;
    private String fullName;
    private String dept;

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeId=" + employeeId +
                ", fullName='" + fullName + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
