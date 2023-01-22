package com.jat.rating;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(info = @Info(title = "This is  the Rating Microservices among 7 microservices architecture build on 2 databses postgres & mongo with spring boot deployed on AWS. The demo show causes the complete architecture & communication in microservices. It is deployed with one click mechanism on AWS. Please contact *** Praveen *** for full demo. It is prepared with java 17, spring version 2.7.7 enabled with EUREKA SERVER, CONFIG-SERVER, API-GATWAY, Open-API 2 & 3, DOCUMENT SERVER, JWT, CIRCUIT-BREAKER, RATE LIMITERS, RETRY, FEIGN-CLIENT, SPING SECURITY & OKTA AUTH. Please feel free to choose another microservice from dropdown of main Document Server.", version = "3.0", description = "It contains & create Rating Information from different users to Hotels assigned during their stay. API is powered by salient features of Spring Boot e.g. [resilence4j](!https://resilience4j.readme.io/docs),"+ 
" [ratelimiters](!https://resilience4j.readme.io/docs/ratelimiter), [circuitbreakers](!https://resilience4j.readme.io/docs/circuitbreaker) " +
		"and further to specify by [Feign client](!https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html). It is working on non relational database [Mongo DB](!https://www.mongodb.com/). The api will be being consumed by User Services Api & finally Hotel Services API. It is already registered on Eurka server" +
		"(https://serviceregitsry-production.up.railway.app/), Spring Cloud API-Gateway, Configuration Server & a Combined Document Server. We are also Implementing protection by [Okta Auth](!https://developer.okta.com/docs/reference/api/authn/), [Spring Security](!https://spring.io/projects/spring-security)  & [JSON Web Based Tokens](!https://www.baeldung.com/spring-security-oauth-jwt). Complete Source Code for all of the services is avaiable at [Source Code](!https://github.com/My-Java-Repos/SpringMicroServicesExample). Please find our Registry Server (https://serviceregitsry-production.up.railway.app/) here & exoplore our apps."))
// @ApiOperation("It is prepared with java 17, spring version 2.7.7 enabled with EUREKA SERVER, CONFIG-SERVER,API-GATWAY, DOCUMENT SERVER & SPING SECURITY with OKTA AUTH")
public class RatingServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingServicesApplication.class, args);
	}

}
