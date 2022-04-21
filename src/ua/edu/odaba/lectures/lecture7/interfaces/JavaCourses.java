package ua.edu.odaba.lectures.lecture7.interfaces;

public class JavaCourses implements Teachable, Funnable {

    @Override
    public void lecturing() {
        System.out.println("I'm teaching");
    }

    @Override
    public void testing() {
        System.out.println("I'm testing");
    }

    @Override
    public void havingFun() {

    }
}
