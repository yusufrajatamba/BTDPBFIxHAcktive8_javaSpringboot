package com.finalproject.yusuf.bus.controller;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.finalproject.yusuf.bus.model.User;

public class BusController {
	
	@SpringBootApplication
	@EnableJpaAuditing
	@EnableSwagger2
	public static class BelajarSpringFinalApplication {

		public static void main(String[] args) {
			SpringApplication.run(BelajarSpringFinalApplication.class, args);
		}

		@Bean
		public Docket postsApi() {
			return new Docket(DocumentationType.SWAGGER_2).select()
					.apis(RequestHandlerSelectors.basePackage("com.example.spring.controller")).build()
					.securitySchemes(Arrays.asList(apiKey()));
		}

		private ApiKey apiKey() {
			return new ApiKey("apiKey", "Authorization", "header");
		}
	}

}
