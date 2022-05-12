package ua.edu.odaba.practices._15_local_maxima_remove;

import java.util.*;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
//        int length = 0;
//
//        if (array[0] < array[1]) length++;
//        if (array[1] < array[0] || array[1] < array[2]) length++;
//        if (array[2] < array[1] || array[2] < array[3]) length++;
//        if (array[3] < array[2] || array[3] < array[4]) length++;
//        if (array[4] < array[3] || array[4] < array[5]) length++;
//        if (array[5] < array[4]) length++;
//
//        int[] result = new int[length];
//        int i = 0;
//
//        if (array[0] < array[1]) {
//            result[i] = array[0];
//            i++;
//        }
//        if (array[1] < array[0] || array[1] < array[2]) {
//            result[i] = array[1];
//            i++;
//        }
//        if (array[2] < array[1] || array[2] < array[3]) {
//            result[i] = array[2];
//            i++;
//        }
//        if (array[3] < array[2] || array[3] < array[4]) {
//            result[i] = array[3];
//            i++;
//        }
//        if (array[4] < array[3] || array[4] < array[5]) {
//            result[i] = array[4];
//            i++;
//        }
//        if (array[5] < array[4]) result[i] = array[5];
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if () {
                length++;
            }
        }



        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {

            } else if () {

            }
        }
        return result;
    }
}

