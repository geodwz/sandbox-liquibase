package com.github.geodwz.sandbox.liquibase;

import org.springframework.boot.SpringApplication;

public class TestSandbox02Application {

	public static void main(String[] args) {
		SpringApplication.from(Sandbox02Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
