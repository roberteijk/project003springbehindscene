package net.vandeneijk.learn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {

    public static void main( String[] args ) {
//        BeanFactory context = new XmlBeanFactory(new FileSystemResource("spring1.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");

        Alien alien1 = (Alien) context.getBean("alien");
        alien1.age = 15;
        alien1.code();
        System.out.println("Age alien: " + alien1.age);
        System.out.println();

        Alien alien2 = (Alien) context.getBean("alien");
        alien2.code();
        System.out.println("Age alien: " + alien2.age); // If scope (defined in spring2.xml) is prototype (instead the default singleton), age is 0. Else age is 15.
        System.out.println();

        Human human = (Human) context.getBean("human");
        human.code();
        System.out.println("Age human: " + human.getAge());
        System.out.println();

        Dolphin dolphin = (Dolphin) context.getBean("dolphin");
        System.out.println("Age dolphin: " + dolphin.getAge());
        System.out.println();
    }
}
