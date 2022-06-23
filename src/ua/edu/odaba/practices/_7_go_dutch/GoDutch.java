package ua.edu.odaba.practices._7_go_dutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {

        int bill;
        int numberOfFriends;
        final int TIPS_PERCENT = 10;
        int payment;

        Scanner scanner = new Scanner(System.in);

        bill = scanner.nextInt();
        numberOfFriends = scanner.nextInt();

        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {

            payment = (bill + ((bill / 100) * TIPS_PERCENT)) / numberOfFriends;
            System.out.println(payment);

        }

    }
}
