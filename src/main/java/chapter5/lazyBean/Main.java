package chapter5.lazyBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(projConfig.class);
        System.out.println("Before retrieving the commentService");
        commentService service = context.getBean(commentService.class);
        System.out.println("After retrieving the commentService");
    }
}
