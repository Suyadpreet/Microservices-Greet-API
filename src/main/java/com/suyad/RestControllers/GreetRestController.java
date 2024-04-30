package com.suyad.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suyad.clients.WelcomeApiClient;

@RestController
public class GreetRestController 
{
	@Autowired
	WelcomeApiClient clients;
	@GetMapping("/greet")
	public String getgreetMsg()
	{
		String greetMsg = "Welcome to Greet API";
		String welcomeApi = clients.invokeWelcomeApi();
		
		return greetMsg+" , "+welcomeApi;
	}
}
