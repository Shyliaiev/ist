package ua.edu.odaba.practices._6_snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int h = input.nextInt();
        int countDays = 1;
        int travelled = a;

        while (true) {
            if (travelled >= h) {
                System.out.println(countDays);
                break;
            }
            travelled = travelled + a - b;
            countDays++;
            if (a - b <= 0) {
                System.out.println("Impossible");
                break;
            }
        }

    }
}
