package com.monitoria.LTP.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.monitoria.LTP.security.service.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().requiresChannel(
                channel -> channel.anyRequest().requiresSecure())
                .authorizeHttpRequests(
                        authorize -> authorize
                                .requestMatchers(HttpMethod.POST, "/cadastro/usuario").permitAll()
                                .requestMatchers(HttpMethod.POST, "/cadastro/materia").permitAll()
                                .requestMatchers(HttpMethod.GET, "/materia").permitAll()
                                .requestMatchers(HttpMethod.GET, "/monitoria").permitAll())


                .authorizeHttpRequests(
                        authorize -> authorize.requestMatchers(HttpMethod.GET, "/usuario").authenticated()
                                              .requestMatchers(HttpMethod.GET, "/usuario/deletar/{id}").authenticated()
                                              .requestMatchers(HttpMethod.GET, "/monitor/deletar/{id}").authenticated()
                                              .requestMatchers(HttpMethod.GET, "/monitor/{id_monitor}").authenticated()
                                              .requestMatchers(HttpMethod.GET, "/materia/deletar/{id}").authenticated())


                .httpBasic(Customizer.withDefaults())
;
        return http.build();
    }

    @Bean
    // Obrigátorio. Vai permitir criptografar as senhas das credenciais de login
    public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();    
    }

    // Novo método de UserDetailsServices
    @Bean
    public UserDetailsService myUserDetailsService() {
        // Retorna o Serviço de Detalhes de Usuario criado por nós!
        return new MyUserDetailService();
    }

    // Método removido
//     @Bean
//     public UserDetailsService userDetailsService() {
//         UserDetails user = User.withDefaultPasswordEncoder()
//                 .username("usuario")
//                 .password("senha")
//                 .build();

//         return new InMemoryUserDetailsManager(user);
//     }
}
