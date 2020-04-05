/**
 * Created by Robert van den Eijk on 5-4-2020.
 */

package net.vandeneijk.learn;

public class Human {

    private int age;
    private Laptop laptop;

    public Human() {
        System.out.println("Human object created.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Human age assigned  by setter injection.");
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code() {
        System.out.println("I'm Coding says the human.");
        laptop.compile();
    }
}
