package chapter5.singletonBean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class projConfig {

    @Bean
    public commentService commentService(){
        return new commentService();
    }
}
