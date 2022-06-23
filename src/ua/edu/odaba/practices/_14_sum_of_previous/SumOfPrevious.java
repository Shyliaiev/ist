package ua.edu.odaba.practices._14_sum_of_previous;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        boolean[] evenNumber = new boolean[array.length];
        evenNumber[0] = false;
        evenNumber[1] = false;

        if (array.length >= 2) {

            try {

                for (int i = 2; i < array.length; i++) {
                    if ((array[i - 2] + array[i - 1]) == array[i]) {
                        evenNumber[i] = true;
                    } else {
                        evenNumber[i] = false;
                    }
                }

                return evenNumber;

            } catch (Exception e) {
                throw new UnsupportedOperationException();
            }

        } else {
            return evenNumber;
        }


    }
}
