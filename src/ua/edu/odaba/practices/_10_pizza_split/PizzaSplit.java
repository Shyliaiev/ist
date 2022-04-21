package ua.edu.odaba.practices._10_pizza_split;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {

        int people;
        int slicesInOnePizza;
        int numberOfPizzas = 1;

        Scanner scanner = new Scanner(System.in);

        people = scanner.nextInt();
        slicesInOnePizza = scanner.nextInt();

        while (numberOfPizzas * slicesInOnePizza % people != 0) {
            numberOfPizzas++;
        }

        System.out.println(numberOfPizzas);

//хватает ли всех кусочков всех заказанныъ пицц чтобы
//                поделить между всеми людьми поровну и
//                без остатка
    }
}
