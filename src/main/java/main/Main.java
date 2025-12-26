package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        String s = context.getBean(String.class);
        Integer n = context.getBean(Integer.class);

        System.out.println(p);
        System.out.println(s.toString());
        System.out.println(n);

    }
}
