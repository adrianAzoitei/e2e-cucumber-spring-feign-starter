package org.aazoitei.cucumber.spring.example.client;

import lombok.NoArgsConstructor;
import org.aazoitei.cucumber.spring.example.client.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// You could replace this with an actual DB (e.g. embedded H2)
@NoArgsConstructor
@Component
public class InMemoryRepository {
    private List<Employee> employees = new ArrayList<>();

    public void save(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> findAll() {
        return employees;
    }

    public List<Employee> findAllWithName(String name) {
        return employees.stream().filter(e -> e.getName().equals(name)).toList();
    }

    public void clear() {
        employees = new ArrayList<>();
    }
}
