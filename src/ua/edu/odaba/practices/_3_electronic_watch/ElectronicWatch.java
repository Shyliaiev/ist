package ua.edu.odaba.practices._3_electronic_watch;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        if (seconds < 0) {
            seconds = 0;
        } else if (seconds >= 86400) {
            seconds %= 86400;
        }

        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;

        System.out.printf("%2d:%02d:%02d", h, m, s);

    }
}
