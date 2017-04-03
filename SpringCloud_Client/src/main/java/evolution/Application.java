package evolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	// Once you start the client, the APP will by default contact spring cloud config server at localhost:8888 to ask for configurations.
	// Spring cloud config server will then contact https://github.com/fslichen/SpringCloud_Configuration for configurations on Github. 
	public static void main(String[] args) { 
		SpringApplication.run(Application.class, args);
	}
}
