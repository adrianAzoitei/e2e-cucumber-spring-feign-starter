package org.aazoitei.cucumber.spring.example.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Value
@Builder
@Jacksonized
public class EmployeesResponse {
    String status;
    @JsonProperty("data")
    List<Employee> employees;
}
