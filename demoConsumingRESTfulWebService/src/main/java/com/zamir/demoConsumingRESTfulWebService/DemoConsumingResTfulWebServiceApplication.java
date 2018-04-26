package com.zamir.demoConsumingRESTfulWebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoConsumingResTfulWebServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoConsumingResTfulWebServiceApplication.class);

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
	}

}