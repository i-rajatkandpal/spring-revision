package Chapter4_2;

import Chapter4_2.Proxies.CommentNotificationProxy;
import Chapter4_2.Proxies.EmailNotificationProxy;
import Chapter4_2.Repository.CommentRepository;
import Chapter4_2.Repository.DBCommentRepository;
import Chapter4_2.Service.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {
    @Bean
    public CommentNotificationProxy commentNotificationProxy(){
        return new EmailNotificationProxy();
    }

    @Bean
    public CommentRepository commentRepository(){
        return new DBCommentRepository();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        return new CommentService(commentNotificationProxy,commentRepository);
    }
}
