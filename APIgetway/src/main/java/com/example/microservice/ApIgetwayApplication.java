package com.example.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
/**
 *
 * @author ADJOU MOUMOUNI Sydney
 *
 * @EnableZuulProxy This tell Zuul that all request arriving at /movies will be routed to
 * localhost:9000 which is our movie service.
 * Note that we have to disable ribbon.eureka.
 * This is because Spring Cloud Netflix Zuul uses Ribbon to deal with the client-side load balancing.
 */
@EnableZuulProxy
public class ApIgetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIgetwayApplication.class, args);
	}
}
