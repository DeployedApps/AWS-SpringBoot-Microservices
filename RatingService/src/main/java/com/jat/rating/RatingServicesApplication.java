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
@OpenAPIDefinition(info = @Info(title = "The Rating Microservices is among 7 microservices build for microservice architecture demo along with 2 databses (postgres & mongo) & it deployed on AWS. The demo show cause all latest strategies in microservices. Please contact *** Praveen *** for demo. It comprises of java 17, spring version 2.7.7, EUREKA SERVER, CONFIG-SERVER, API-GATWAY, OpenAPI, DOCUMENT SERVER, JWT, CIRCUIT-BREAKER, RATE LIMITERS, RETRY, FEIGN-CLIENT, SPRING SECURITY & OKTA AUTH. Please explore other microservice from dropdown [TOP RIGHT] of main Document-Server.", version = "3.0", description = "It contains & create Rating Information from different users to Hotels assigned during their stay. API is powered by salient features of Spring Boot e.g. [resilence4j](!https://resilience4j.readme.io/docs),"+
" [ratelimiters](!https://resilience4j.readme.io/docs/ratelimiter), [circuitbreakers](!https://resilience4j.readme.io/docs/circuitbreaker) " +
		"and further to specify by [Feign client](!https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html). It is working on non relational database [Mongo DB](!https://www.mongodb.com/). The api will be being consumed by User Services Api & finally Hotel Services API. It is already registered on Eurka server" +
		"(https://serviceregitsry-production.up.railway.app/), Spring Cloud API-Gateway, Configuration Server & a Combined Document Server. We are also Implementing protection by [Okta Auth](!https://developer.okta.com/docs/reference/api/authn/), [Spring Security](!https://spring.io/projects/spring-security)  & [JSON Web Based Tokens](!https://www.baeldung.com/spring-security-oauth-jwt). Complete Source Code for all of the services is avaiable at [Source Code](!https://github.com/My-Java-Repos/SpringMicroServicesExample). Please find our Registry Server (https://serviceregitsry-production.up.railway.app/) here & exoplore our apps."))
// @ApiOperation("It is prepared with java 17, spring version 2.7.7 enabled with EUREKA SERVER, CONFIG-SERVER,API-GATWAY, DOCUMENT SERVER & SPING SECURITY with OKTA AUTH")
public class RatingServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingServicesApplication.class, args);
	}

}