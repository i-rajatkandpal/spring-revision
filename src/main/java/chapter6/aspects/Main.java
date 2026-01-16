package chapter6.aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(projConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Hey! I am learning spring");
        comment.setAuthor("Rajat-Kandpal");

        commentService.publishComment(comment);
    }
}
