package ua.edu.odaba.practices._5_meet_strangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        try {

            int amountOfStrangers = scanner.nextInt();

            if (amountOfStrangers > 0) {

                for (int i = 0; i < amountOfStrangers; i++) {
                    System.out.println("Hello, " + scanner1.nextLine());
                }

            } else if (amountOfStrangers == 0) {
                System.out.println("Oh, it looks like there is no one here");
            } else if (amountOfStrangers < 0) {
                System.out.println("Seriously? Why so negative?");
            }

        } catch (Exception e) {
            throw new IOException();
        }




    }
}
