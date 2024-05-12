package com.paf.gymgoals;

import com.paf.gymgoals.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class GymGoalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymGoalsApplication.class, args);
	}

}
