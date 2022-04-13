package ua.edu.odaba.lectures.lecture7.inheritance;

import ua.edu.odaba.lectures.lecture7.control.Sample;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.setType("fish");
        animal.voice();

        dog.setName("Zhuchka");
        dog.voice();

        Haski haski = new Haski();

//        haski.field = "Valera";

        System.out.println();
    }
}
