package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// After Spring Boot 1.3, it now accepts scanBasePackages as an arguement to allow you to add other packages to be autowired
@SpringBootApplication(scanBasePackages={"hello"})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}