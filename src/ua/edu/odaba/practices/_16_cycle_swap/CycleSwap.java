package ua.edu.odaba.practices._16_cycle_swap;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {

        try {

            int last = array[array.length - 1];

            for (int index = array.length - 2; index >= 0; index--)
                array[index+1] = array[index];

            array[0] = last;

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }



    }

    static void cycleSwap(int[] array, int shift) {

        try {

            for (int i = 0; i < shift; i++) {
                cycleSwap(array);
            }

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }



    }
}