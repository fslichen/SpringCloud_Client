package evolution.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import evolution.util.Sys;

@RefreshScope// Pull updated values from the spring cloud server.
@RestController
public class AnyController {
	// This property is provided by spring cloud config server.
	// This property in fact comes from https://github.com/fslichen/SpringCloud_Configuration.
	// Corresponds to application.properties from SpringCloud_Github, which is always fetched.
	@Value("${message}")
	private String message;
	
	// Corresponds to any-configuration.properties from SpringCloud_Github.
	@Value("${name}")
	private String name;
	
	// Corresponds to any-configuration.properties from SpringCloud_Github.
	@Value("${gender}")
	private String gender;
	
	// Corresponds to server.port in application.properties in the current project.
	// The port number of the client and the spring cloud config server should be different.
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/client")
	public void client() {
		Sys.println("Welcome to the client.");
		Sys.println("Port = " + port);
		Sys.println("Message = " + message);
		Sys.println("Name = " + name);
		Sys.println("Gender = " + gender);
	}
}
