package org.aazoitei.cucumber.spring.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_lol.AN;
import org.aazoitei.cucumber.spring.example.client.ExampleClient;
import org.aazoitei.cucumber.spring.example.client.InMemoryRepository;
import org.aazoitei.cucumber.spring.example.client.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ExamplesAPISteps {

    @Autowired
    ExampleClient exampleClient;

    @Autowired
    InMemoryRepository repository;

    @Given("a list of employees")
    public void getEmployees() {
        repository.save(exampleClient.getEmployees().getEmployees());
    }

    @Then("an id exists for each employee")
    public void ensureIdExists() {
        var employeesWithoutId = repository.findAll().stream().filter(e -> e.getId() == null).toList();

        if (!employeesWithoutId.isEmpty()) {
            throw new RuntimeException("Oh-oh! Some employees do not have an id!");
        }
    }

    @Then("and there is at least an employee named {string}")
    public void employeesWithName(String name) {
        var employeesWithName = repository.findAllWithName(name);

        if (employeesWithName.isEmpty()) {
            throw new RuntimeException("Oh-oh! Nobody is called %s".formatted(name));
        }
    }

}
