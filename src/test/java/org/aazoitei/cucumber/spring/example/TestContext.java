package org.aazoitei.cucumber.spring.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@EnableAutoConfiguration
@ComponentScan
public class TestContext {

}
