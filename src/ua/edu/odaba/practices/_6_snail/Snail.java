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

        int countDays = 1;          //First day

        int travelled = a;          //Snail had travelled

        while (true) {
            if (travelled >= h) {               //what  happened first day
                System.out.println(countDays);
                break;
            }
            travelled = travelled - b + a; //next day   previos day travelled + how much it will travel
            countDays++;
            if (a - b <= 0) {
                System.out.println("Impossible");
                break;
            }
        }

//      Вариант Шиляева
//        int speed = a - b;
//        if (speed == h) {
//            System.out.println();
//        }
//
//        countDays = h / speed;
//      вариант Дмитрия
//        if (a != h)  {
//            a = a - b;
//            countDays++;
//        } else {
//            System.out.println("Impossible");
//        }

//        System.out.println(speed);


    }
}
