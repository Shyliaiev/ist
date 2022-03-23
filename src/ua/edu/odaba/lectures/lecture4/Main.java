package ua.edu.odaba.lectures.lecture4;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 3;

//        //Simple check
//        if (a < b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

        //Complex check
//        if (a < b) {
//            if (a < c) {
//                System.out.println(a);
//            }
//        } else if (b < a) {
//            if (b < c) {
//                System.out.println(b);
//            }
//        }  else {
//            System.out.println(c);
//        }

        //a<b<c
        if (a < b && a < c) {
            System.out.println(a);
        } else  if  (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        //Logical operators
        boolean check = true;


        if (check) {
            System.out.println("check = true");
        }



        if (check != true) {
            System.out.println("check = false");
        } else {
            System.out.println("check = true");
        }

        int inte = (int) 9999999999l;

        class Animal {}
        class Cat extends Animal {}


        Animal animaL =  new  Animal();
        Cat cat =  new  Cat();

        cat = (Cat) animaL;


        System.out.println(inte);

    }
//    public static class ShortCircuit {
//        static boolean test1(int val) {
//            System.out.println("test1(" + val + ")");
//            System.out.println("result: " + (val < 1));
//            return val < 1;
//        }
//        static boolean test2(int val) {
//            System.out.println("test2(" + val + ")");
//            System.out.println("result: " + (val < 2));
//            return val < 2;
//        }
//        static boolean test3(int val) {
//            System.out.println("test3(" + val + ")");
//            System.out.println("result: " + (val < 3));
//
//            System.out.println("This message is to be shown every time the program runs");
//
//            return val < 3;
//        }
//        public static void main(String[] args) {
//            boolean b = test1(0) && test2(2) && test3(2);
//
//
//            System.out.println("expression is " + b);
//
//
//            System.out.println("///////////");
//
//            test3(5);
//
//        }
//    }
}
