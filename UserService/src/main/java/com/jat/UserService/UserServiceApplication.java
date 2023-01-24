package com.jat.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "The User Microservices is among 7 microservices build for microservice architecture demo along with 2 databses (postgres & mongo)deployed on AWS. The demo show cause all latest strategies in microservices. Please contact *** Praveen *** for demo. It comprises of java 17, spring version 2.7.7, EUREKA SERVER, CONFIG-SERVER, API-GATWAY, OpenAPI, DOCUMENT SERVER, JWT, CIRCUIT-BREAKER, RATE LIMITERS, RETRY, FEIGN-CLIENT, SPRING SECURITY & OKTA AUTH. Please explore other microservice from dropdown [TOP RIGHT] of main Document-Server.", version = "3.0", description = "USER-SERVICE contains User Information along with Hotel information which user has provided durings his stay."+
		" The API is powered by salient features of Spring Boot e.g. [resilence4j](!https://resilience4j.readme.io/docs),"+
" [ratelimiters](!https://resilience4j.readme.io/docs/ratelimiter), [circuitbreakers](!https://resilience4j.readme.io/docs/circuitbreaker) " +
		"and further declartive [Feign client](!https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html). It is working on relational database [Postgres DB](!https://www.postgresql.org/).The api will be being consumed by Rating Services Api & finally Hotel Services API. It is already registered on # [Eurka server](!http://servi-loadb-1m010cvxc8v81-1110713425.us-east-2.elb.amazonaws.com/) #"+
		"Spring Cloud API-Gateway, Configuration Server & a Combined Document Server. We are also Implementing protection by [Okta Auth](!https://developer.okta.com/docs/reference/api/authn/), [Spring Security](!https://spring.io/projects/spring-security)  & [JSON Web Based Tokens](!https://www.baeldung.com/spring-security-oauth-jwt). Please explore the Service below"))
// @ApiOperation("It is prepared with java 17, spring version 2.7.7 enabled with EUREKA SERVER, CONFIG-SERVER,API-GATWAY, DOCUMENT SERVER & SPING SECURITY with OKTA AUTH. Complete Source Code for all of the services is avaiable at [Source Code](!https://github.com/My-Java-Repos/SpringMicroServicesExample)")
public class UserServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
