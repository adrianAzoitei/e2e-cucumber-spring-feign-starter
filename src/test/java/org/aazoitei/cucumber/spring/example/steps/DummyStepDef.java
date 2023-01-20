package org.aazoitei.cucumber.spring.example.steps;

import io.cucumber.java.en.Given;
import org.aazoitei.cucumber.spring.example.client.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;

public class DummyStepDef {

    @Autowired
    ExampleClient exampleClient;

    @Given("dummy exists")
    public void dummyExists() {
        exampleClient.getEmployees();
    }

}
