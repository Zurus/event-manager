package ru.event_manager.store.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Отключаем CSRF для упрощения (не рекомендуется в продакшене)
                .authorizeRequests()
                .antMatchers("/", "/auth").permitAll() // Разрешаем доступ к главной странице и auth
                .anyRequest().authenticated() // Все остальные страницы требуют аутентификации
                .and()
                .csrf().disable(); // Отключаем стандартную форму логина
    }


//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/", "/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login()
//                .loginPage("/login")
//                .defaultSuccessUrl("/info", true)
//                .and()
//                .logout()
//                .logoutSuccessUrl("/");
//    }
}
