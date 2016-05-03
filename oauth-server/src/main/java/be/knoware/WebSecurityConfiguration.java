package be.knoware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by ovanekem on 03/05/16.
 */
public class WebSecurityConfiguration {
    @Configuration
    public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

        @Autowired
        public void globalUserDetails(final AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication().withUser("olivier").password("knoware").roles("ROLE_USER,ROLE_ADMIN").
                    and().withUser("user").password("password").roles("ROLE_USER");
        }

        @Override
        @Bean
        public AuthenticationManager authenticationManagerBean() throws Exception {
            return super.authenticationManagerBean();
        }

        @Override
        protected void configure(final HttpSecurity http) throws Exception {
            http.authorizeRequests().antMatchers("/login").permitAll()
                    .anyRequest().authenticated().and().formLogin().permitAll();
        }
    }
}
