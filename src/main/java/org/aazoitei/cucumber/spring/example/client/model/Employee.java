package org.aazoitei.cucumber.spring.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Employee {
    Integer id;
    @JsonProperty("employee_name")
    String name;
    @JsonProperty("employee_salary")
    String salary;
    @JsonProperty("employee_age")
    int age;
}
