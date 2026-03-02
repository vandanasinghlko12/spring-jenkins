package spring_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
		System.out.println("i am up and running");
		System.out.println("i am testing");
	}

}
