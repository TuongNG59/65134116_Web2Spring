package thigk2.nguyenhuynhtuong.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())

            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/**").permitAll()      
                .requestMatchers("/admin/**").authenticated() 
                .anyRequest().permitAll()                    
            )
            
            .formLogin(form -> form
                .defaultSuccessUrl("/admin/tintuc", true)
                .permitAll()
            )
            
            .logout(logout -> logout.permitAll());

        return http.build();
    }
}
