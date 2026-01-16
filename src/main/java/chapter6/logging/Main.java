package chapter6.logging;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(projConfig.class);

        commentService service = context.getBean(commentService.class);

        Comment comment = new Comment();
        comment.setText("Hey! There I am learning Spring.");
        comment.setAuthor("Rajat-Kandpal");
        service.publishComment(comment);
    }
}
