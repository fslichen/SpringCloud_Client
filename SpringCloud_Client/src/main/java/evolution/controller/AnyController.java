package evolution.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import evolution.util.Sys;

@RestController
public class AnyController {
	// This property is provided by spring cloud config server.
	// This property in fact comes from https://github.com/fslichen/SpringCloud_Configuration.
	@Value("${message}")
	private String message;
	
	// Corresponds to server.port in application.properties in the current project.
	// The port number of the client and the spring cloud config server should be different.
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/client")
	public void client() {
		Sys.println("Welcome to the client.");
		Sys.println("Port = " + port);
		Sys.println("Message = " + message);
	}
}
