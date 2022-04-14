package ua.edu.odaba.practices._9_average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int item;
        int sum = 0;
        int count = 0;

        while (true) {
            item = scanner.nextInt();
            if (item == 0) {
                break;
            }
            sum += item;

            count++;
        }

        System.out.println(sum / count);

    }
}
