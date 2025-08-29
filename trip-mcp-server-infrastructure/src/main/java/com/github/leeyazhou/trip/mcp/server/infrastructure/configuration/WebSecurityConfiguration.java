package com.github.leeyazhou.trip.mcp.server.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Web security configuration.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/", "/home", "/login", "/public/**")
        .permitAll()
        .requestMatchers("/ai/**")
        .authenticated() // 保护所有 /ai 路径下的端点
        .anyRequest()
        .authenticated())
        .formLogin(form -> form.loginPage("/login")
            .permitAll())
        .logout(logout -> logout.permitAll());
    return http.build();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    UserDetails user = User.withUsername("user")
        .password("{noop}password") // 生产环境务必使用编码器！
        .roles("USER")
        .build();
    UserDetails admin = User.withUsername("admin")
        .password("{noop}adminpass")
        .roles("USER", "ADMIN", "AI_USER")
        .build();
    UserDetails premium = User.withUsername("premium")
        .password("{noop}premiumpass")
        .roles("USER", "AI_PREMIUM")
        .build();
    return new InMemoryUserDetailsManager(user, admin, premium);
  }
}
