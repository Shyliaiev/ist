package ua.edu.odaba.practices._13_sum_of_even_numbers;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, -6, -4, 15, 199};
//        System.out.println(Arrays.toString(array));
        System.out.println(sum(array));
//        System.out.println(Arrays.toString(array));
    }

    public static int sum(int[] array){
        int sum = 0;

        if (array == null) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }
}

// Check for MAX_VALUE