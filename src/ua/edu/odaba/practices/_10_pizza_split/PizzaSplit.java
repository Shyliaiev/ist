package ua.edu.odaba.practices._10_pizza_split;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] splitNumber = data.split(" ");
        int people = Integer.parseInt(splitNumber[0]);
        int pieces = Integer.parseInt(splitNumber[1]);
        int result = 1;

        while (true) {
            if ((pieces * result) % people != 0) {
                result++;
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}
