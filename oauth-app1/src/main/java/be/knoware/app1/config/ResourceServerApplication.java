package be.knoware.app1.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by ovanekem on 03/05/16.
 */
@SpringBootApplication
public class ResourceServerApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ResourceServerApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(be.knoware.app1.config.ResourceServerApplication.class, args);
    }
}
