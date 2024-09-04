//package com.swadhin.bolg;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.swadhin.bolg.security.JwtAuthenticationEntryPoint;
//import com.swadhin.bolg.security.JwtAuthenticationFilter;
//
//
//
//@Configuration
//@EnableWebSecurity
//public class JwtConfig {
//	
//	@Autowired
//    private JwtAuthenticationEntryPoint point;
//	
//	@Autowired
//    private JwtAuthenticationFilter filter;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
//        return security.csrf(csrf -> csrf.disable())
//                .cors(cors -> cors.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().authenticated())
//                .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
//                .build();
//    }
//}
