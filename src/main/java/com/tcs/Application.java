package com.tcs;

import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMethod;
import com.google.common.base.Predicate;
import com.tcs.service.SubscriptionService;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackageClasses = { SubscriptionService.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Docket petApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				// .apis(RequestHandlerSelectors.any())
				.apis(customRequestHandlers()).paths(PathSelectors.any()).build().pathMapping("/");
	}

	// this custom request handler will filter the type of endpoint showing on the
	// ui
	private Predicate<RequestHandler> customRequestHandlers() {
		return new Predicate<RequestHandler>() {
			@Override
			public boolean apply(RequestHandler input) {
				Set<RequestMethod> methods = input.supportedMethods();
				return methods.contains(RequestMethod.GET) || methods.contains(RequestMethod.POST)
						|| methods.contains(RequestMethod.PUT) || methods.contains(RequestMethod.DELETE);
			}
		};
	}
}
