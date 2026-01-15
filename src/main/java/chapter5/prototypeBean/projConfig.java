package chapter5.prototypeBean;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class projConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public commentService commentService(){
        return new commentService();
    }
}
