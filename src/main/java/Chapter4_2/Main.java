package Chapter4_2;

import Chapter4_2.Service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);

        Comment comment = new Comment();
        comment.setText("Hey!");
        comment.setAuthor("Rajat-Kandpal");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
