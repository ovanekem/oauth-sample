package be.knoware.app1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ovanekem on 03/05/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan("be.knoware.app1.controller")
public class WebConfiguration  extends WebMvcConfigurerAdapter {
}
