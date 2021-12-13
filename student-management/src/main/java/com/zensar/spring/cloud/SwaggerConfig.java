package com.zensar.spring.cloud;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/**"))
				.apis(RequestHandlerSelectors.basePackage("com.zensar.spring.cloud")).build().apiInfo(apiDetails());
	}

	public ApiInfo apiDetails() {
	/*	return new ApiInfo("Student Management API", "Sample API for Zensar Training", 2.0, "Free for everyone",
				new Contact("Sharad Rajore", "http://www.zensar.com", "zensar.com"), "API license",
				"http://www.zensar.com",new VendorExtension<S>() {
				});*/
		
		return new ApiInfoBuilder().title("Student Management API").version("2.0.0")
                .description("Sample API for Zensar Training")
                .license("Apache 2.0")
                .build();
		
		
		
	}

}
