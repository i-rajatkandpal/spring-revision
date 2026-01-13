package chapter3.four;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(fourConfig.class);
        Person p = context.getBean(Person.class);
        System.out.println("Person's Name: " + p.getName());
        System.out.println("Person's Parrot " + p.getParrot().getName());
    }
}
