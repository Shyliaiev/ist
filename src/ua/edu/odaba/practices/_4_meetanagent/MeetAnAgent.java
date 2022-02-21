package ua.edu.odaba.practices._4_meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int password = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        if (pass == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
