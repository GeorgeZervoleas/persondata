package com.example.persondata.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("javainuse")
                .password("javainuse").roles("USER");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/**").authenticated()
               // .antMatchers("/rest/**").authenticated()
                .anyRequest().permitAll().and()
                .csrf().disable()
                //.formLogin().loginPage("/login.jsp")
                .formLogin().loginPage("/getAllRecords")
                .defaultSuccessUrl("/getAllRecords").permitAll();

//        http.antMatcher("/getAllRecords*").authorizeRequests().and().formLogin().permitAll();


  /*      http.antMatcher("/**").authorizeRequests().anyRequest().hasRole("USER")
                .and().formLogin().loginPage("/login.jsp")
                .failureUrl("/login.jsp?error=1").loginProcessingUrl("/login.jsp")
                .permitAll().and().logout()
                .logoutSuccessUrl("/getAllRecords");


        http.authorizeRequests().antMatchers("/ui/**").authenticated()
                .antMatchers("/rest/**").authenticated()
                .anyRequest().permitAll().and()
                .csrf().disable()
                .formLogin().loginPage("/login.jsp")
                .defaultSuccessUrl("/getAllRecords").permitAll();
*/
    }

}

