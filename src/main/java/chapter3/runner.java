package chapter3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(chap3Config.class);
        Parrot parrot = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);

        System.out.println("Parrot's Name : " + parrot.getName());
        System.out.println("Person's Name : " + person.getName());
        System.out.println("Person's Parrot's Name : " + person.getParrot());

    }
}
