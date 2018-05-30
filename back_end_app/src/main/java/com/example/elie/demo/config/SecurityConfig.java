package com.example.elie.demo.config;
import com.example.elie.demo.services.UserSercurityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * main security configuration class for spring security
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    public Environment environment;
    private UserSercurityServiceImpl userSecurityService;


    private static String[] PUBLIC_MATCHES = {
        "/css/**",
            "/js/**",
            "/image/**",
            "/book/**",
            "/user/**"
    };


    private BCryptPasswordEncoder passwordEncoder(){
        return SecurityUtility.passwordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable().httpBasic().and().authorizeRequests()
                .antMatchers(PUBLIC_MATCHES).permitAll().anyRequest().authenticated();
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
    }


    /******************* Dependency Injection setter**********/

    @Autowired
    public void setUserSecurityService(UserSercurityServiceImpl userSecurityService) {
        this.userSecurityService = userSecurityService;
    }
    /******************* Dependency Injection end************/
}
