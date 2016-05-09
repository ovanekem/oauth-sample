package be.knoware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by ovanekem on 03/05/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ClientApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
