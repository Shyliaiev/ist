package ua.edu.odaba.practices._13_sum_of_even_numbers;


public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        if (sum % 2 == 0) {
            System.out.println("number " + n + " even");
        } else {
            System.out.println("number " + n + " odd");
        }

        return sum;
    }
}

// Check for MAX_VALUE