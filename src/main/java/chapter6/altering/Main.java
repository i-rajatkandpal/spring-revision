package chapter6.altering;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(projConfig.class);

        Comment comment = new Comment();
        comment.setText("xxxxxxxxxxxx");

        CommentService service = context.getBean(CommentService.class);
        String value = service.publishComment(comment);

        logger.info(value);
    }
}
