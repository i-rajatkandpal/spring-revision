package chapter6.altering;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "chapter6.altering")
@EnableAspectJAutoProxy
public class projConfig {
}
