package ua.edu.odaba.practices._13_sum_of_even_numbers;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{-2,10,0,5};
        int result = SumOfEvenNumbers.sum(array);
        System.out.println(result);
    }

    public static int sum(int[] array) {

        int sum = 0;

        try {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    sum += array[i];
                }
            }

            return sum;

        } catch (Exception e) {
            return  0;
        }
    }
}

