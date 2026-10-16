package com.github.wootaepark.askdata;

import org.springframework.boot.SpringApplication;

public class TestAskdataApplication {

	public static void main(String[] args) {
		SpringApplication.from(AskdataApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
