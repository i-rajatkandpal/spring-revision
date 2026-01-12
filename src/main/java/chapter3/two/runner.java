package chapter3.two;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(twoConfig.class);

        Person p = context.getBean(Person.class);
        System.out.println("person's Name: " + p.getName());
        System.out.println("person parrot: " + p.getParrot());
    }
}
