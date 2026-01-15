package chapter5.prototypeBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(projConfig.class);

        commentService cs1 = context.getBean(commentService.class);
        commentService cs2 = context.getBean(commentService.class);

        System.out.println(cs1 == cs2); //false

    }
}
