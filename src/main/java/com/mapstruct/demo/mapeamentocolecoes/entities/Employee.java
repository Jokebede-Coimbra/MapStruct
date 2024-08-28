package com.mapstruct.demo.mapementocolecoes.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String department;
}
