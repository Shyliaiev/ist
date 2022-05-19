package ua.edu.odaba.practices._16_cycle_swap;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            temp[i + 1] = array[i];
        }
        temp[0] = array[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }

//        array = Arrays.copyOf(temp, temp.length);
//        System.arraycopy(temp, 0, array, 0, temp.length);
//        System.out.println("inside class " + Arrays.toString(array));
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length != 0) {
            int[] temp = Arrays.copyOfRange(array, 0, array.length - shift);
            System.arraycopy(array, array.length - shift, array, 0, shift);
            System.arraycopy(temp, 0, array, shift, temp.length);
        }
    }
}