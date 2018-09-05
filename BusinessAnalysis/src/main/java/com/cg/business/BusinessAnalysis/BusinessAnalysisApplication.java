package com.cg.business.BusinessAnalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.cg.business.repo")
@ComponentScan("com.cg.business")
@EntityScan("com.cg.business.beans")
@SpringBootApplication
public class BusinessAnalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessAnalysisApplication.class, args);
	}
}
