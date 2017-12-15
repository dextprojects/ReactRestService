package com.dext.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
@EntityScan(basePackages = { "com" })
@Import(RootConfig.class)
public class ReactRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactRestServiceApplication.class, args);
	}
}
