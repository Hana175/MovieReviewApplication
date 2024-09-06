package dev.hana.movies; // Package declaration

// Importing the required classes, spring application contains a method called run, and to start the spring application i have to  call this run method and pass the application class to it
// then pass command line args to the run method
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

//annotation: lets compiler know about what this class does.
@SpringBootApplication
@RestController // this is a rest controller rest api controller

public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	// @GetMapping() // this getmapping annotation it lets the framework know that
	// // this method is an
	// // // endpoint
	// public String apiRoot() {
	// 	return "Welcome to the movies API by hana!";
	// }

}
