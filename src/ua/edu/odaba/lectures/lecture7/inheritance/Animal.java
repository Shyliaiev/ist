package ua.edu.odaba.lectures.lecture7.inheritance;

public class Animal {
    private String type;

    Animal(){
        this.type = "unknown";
    }

    public void voice() {
        System.out.println("Hi, I'm an animal. I'm a specie of " + type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
