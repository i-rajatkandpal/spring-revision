package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = new Parrot();
        p.setName("mithu");

        Supplier<Parrot> parrotSupplier = ()-> p;
        context.registerBean("parrot2",Parrot.class,parrotSupplier);

        Parrot alpha = context.getBean("parrot1",Parrot.class);
        System.out.println(alpha.getName());

    }
}
