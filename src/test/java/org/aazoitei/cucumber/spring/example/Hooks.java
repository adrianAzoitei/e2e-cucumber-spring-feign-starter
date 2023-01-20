package org.aazoitei.cucumber.spring.example;


import io.cucumber.java.Before;
import org.aazoitei.cucumber.spring.example.client.InMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {
    @Autowired
    InMemoryRepository repository;

    @Before
    public void clearRepository() {
        repository.clear();
    }
}
