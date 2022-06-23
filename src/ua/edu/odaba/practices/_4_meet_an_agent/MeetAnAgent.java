package ua.edu.odaba.practices._4_meet_an_agent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int password = 133976;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputPassword = scanner.nextInt();
        if (inputPassword == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }

    }
}
