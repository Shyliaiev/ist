package ua.edu.odaba.practices._11_quadratic_equation;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] splitNumber = data.split(" ");
        double D;
        double a = Double.parseDouble(splitNumber[0]);
        double b = Double.parseDouble(splitNumber[1]);
        double c = Double.parseDouble(splitNumber[2]);

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(x1 + " " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println("no roots");
        }
    }
}
