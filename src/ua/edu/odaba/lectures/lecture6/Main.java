package ua.edu.odaba.lectures.lecture6;

public class Main {
    public static void main(String[] args) {
//        int integer = 0;
//
//        integer++;
//
//        System.out.println(integer);

//        String string = null;
//        string = string + "1";

        Cat vaska = new Cat(5, "Valerka");
        Cat valerka = new Cat("Valerka", 5);
        Cat barsik = new Cat(3, "Barsik");

        System.out.println(vaska.getName());

        vaska.setName("Vaska");

        System.out.println(vaska.getName());

        vaska.meow();
        valerka.meow(false);
        barsik.meow(true);
    }
}

class Cat {
    private int age;
    private String name;

//    Cat() {
//        name = "Valera";
//    }

    Cat(int age, String name) {
        this.age = age;
        this.name  = name;
    }

    Cat(String name, int age) {
        System.out.println("Second constructor called");
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow(){
        System.out.println(name + " meow");
    }

    public void meow(boolean kicked){
        if (kicked) {
            System.out.println(name + " hissing");
        } else {
            meow();
        }
    }

}
