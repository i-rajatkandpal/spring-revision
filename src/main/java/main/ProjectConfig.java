package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Primary
    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("chumi don");
        return p;
    }
}

