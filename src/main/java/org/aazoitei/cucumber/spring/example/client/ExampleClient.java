package org.aazoitei.cucumber.spring.example.client;


import org.aazoitei.cucumber.spring.example.client.model.EmployeesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/*
Set up an HTTP Client by declaring an interface and annotating it with @FeignClient.
Spring Boot will pick it up and implement it at build time.
 */
@FeignClient(name = "example", url = "https://dummy.restapiexample.com/api/v1/")
public interface ExampleClient {
    @GetMapping(value = "employees")
    EmployeesResponse getEmployees();
}
