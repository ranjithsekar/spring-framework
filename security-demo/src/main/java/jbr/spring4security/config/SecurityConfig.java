package jbr.spring4security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  public void configureGlobalSecurity(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
    authenticationManagerBuilder.inMemoryAuthentication()
        .withUser("ram")
        .password("kumar")
        .roles("EMPLOYEE");

    authenticationManagerBuilder.inMemoryAuthentication()
        .withUser("kabilan")
        .password("ranjith")
        .roles("MANAGER");

    authenticationManagerBuilder.inMemoryAuthentication()
        .withUser("ranjith")
        .password("sekar")
        .roles("ADMIN", "MANAGER");
  }

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    httpSecurity.authorizeRequests()
        .antMatchers("/", "/home")
        .permitAll()
        .antMatchers("/employee/**")
        .access("hasRole('MANAGER') or hasRole('EMPLOYEE')")

        .antMatchers("/manager/**")
        .access("hasRole('MANAGER')")

        .antMatchers("/leave_approval/**")
        .access("hasRole('MANAGER') and hasRole('ADMIN')")

        .and()
        .formLogin()
        .and()
        .exceptionHandling()
        .accessDeniedPage("/access_denied");
  }
}