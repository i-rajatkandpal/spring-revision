package Chapter4_2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "Chapter4_2.Proxies",
        "Chapter4_2.Repository",
        "Chapter4_2.Service"
})

public class appConfig {
}
