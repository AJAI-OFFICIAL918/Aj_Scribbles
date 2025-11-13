package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
        return  http
                .csrf(consumer->consumer.disable())
                .authorizeHttpRequests(request->request.anyRequest().authenticated())
//                .formLogin(Customizer.withDefaults())// It is optional browser la default login varadhukaaga
                .httpBasic(Customizer.withDefaults())//It is must appo dhaan console return work aagum illana HTML file dhaan varum O/P la
                .sessionManagement(session->session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))//session ah disable panni stateless ah mathirukom
                .build();


    }
}
