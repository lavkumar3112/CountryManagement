package com.eleos.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class WebConfig {

  @Bean
  public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    // Create a CorsConfiguration
    CorsConfiguration corsConfiguration = new CorsConfiguration();
    corsConfiguration.applyPermitDefaultValues();

    // Register the CorsConfiguration with a UrlBasedCorsConfigurationSource
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", corsConfiguration);

    http.cors().configurationSource(request -> corsConfiguration)
      .and()
      .csrf().disable()
      .authorizeRequests(authorizeRequests ->
        authorizeRequests
          .anyRequest().permitAll()
      );

    return http.build();
  }
}
