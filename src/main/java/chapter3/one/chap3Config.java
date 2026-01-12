package chapter3.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class chap3Config {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("Rajat");
        p.setParrot(parrot);
        return p;
    }
}
