package ua.edu.odaba.practices._8_find_max_in_seq;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        Scanner scanner = new Scanner(System.in);

        int item;
        int max = scanner.nextInt();

        while (true) {
            item = scanner.nextInt();
            if (item == 0) {
                break;
            }
            if (item > max) {
                max = item;
            }
        }

        return max;

    }

    public static void main(String[] args) {

        System.out.println("Test your code here!");

        // Get a result of your code

        System.out.println(max());
    }
}

