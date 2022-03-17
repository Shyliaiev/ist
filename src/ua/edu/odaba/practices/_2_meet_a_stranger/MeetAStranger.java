package ua.edu.odaba.practices._2_meet_a_stranger;

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
//        System.out.print("Please, enter some text: \n");
        Scanner scanner = new Scanner(System.in);

        String readInput = scanner.nextLine();
        System.out.println("Hello, " + readInput);
    }
}