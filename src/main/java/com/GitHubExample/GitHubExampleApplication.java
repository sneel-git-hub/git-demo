package com.GitHubExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHubExampleApplication.class, args);
	}

	public String test() {
		return "This is test.";
	}
}
