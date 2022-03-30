package ua.edu.odaba.lectures.lecture5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter speed");
//        int speed = scanner.nextInt();
////        Scanner scanner1 = new Scanner(System.in);
////        System.out.println("Please enter road type");
//        scanner.nextLine();
//        String road = scanner.nextLine();


//        switch (road) {
//            case "city":
//                if (speed <= 50) {
//                    System.out.println("OK");
//                } else if (speed <= 70) {
//                    System.out.println("Fast");
//                } else {
//                    System.out.println("Too fast");
//                }
//                break;
//            case "motorway":
//                if (speed <= 90) {
//                    System.out.println("OK");
//                } else if (speed <= 110) {
//                    System.out.println("Fast");
//                } else {
//                    System.out.println("Too fast");
//                }
//                break;
//            case "highway":
//                if (speed <= 110) {
//                    System.out.println("OK");
//                } else if (speed <= 130) {
//                    System.out.println("Fast");
//                } else {
//                    System.out.println("Too fast");
//                }
//                break;
//            default:
//                System.out.println("You've entered smth incorrect");
//        }


//        int count = 0;
//
//        while (count < 3) {
//            System.out.println(count);
//            count++;
//        }
//
//
//        System.out.println("Count is " + count);
//
//         do {
//            System.out.println(count);
//            count++;
//        } while (count < 3);

//        while (true) {
//            count = scanner.nextInt();
//            if (count %2 == 0) {
//                System.out.println("thanks");
//                break;
//            }
//            System.out.println("please  try again");
//        }

//        while (true) {
//            count = scanner.nextInt();
//            if (count %2 != 0) {
//                System.out.println("please try again, the number is odd");
//                continue;
//            }
//            System.out.println("This is  even number");
//        }

//        for (int i = 1; i < 100; i*=2) {
//            System.out.println(i);
//        }

//        int[] array = {1, 4, 0 , 932, 231, 123, 456};
//
////        for (int i = 0; i < array.length; i++) {
////            System.out.println(array[i]);
////        }
//
//        for (int i : array) {
//            System.out.println(i);
//        }
//
//    }
        System.out.println(greetings("Valera"));
}

    private static String greetings(String name) {
        return "hello, " + name;
    }
}
