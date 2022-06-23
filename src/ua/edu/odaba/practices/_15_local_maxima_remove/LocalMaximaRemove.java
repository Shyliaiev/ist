package ua.edu.odaba.practices._15_local_maxima_remove;

import java.util.*;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        int count = 0;
        Integer[] newArray = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    newArray[i] = null;
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    newArray[i] = null;
                }
            } else {
                if (array[i - 1] < array[i] && array[i + 1] < array[i]) {
                    newArray[i] = null;
                }
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != null) {
                count++;
            }
        }

        if (count > 0) {
            int[] resultArray = new int[count];
            int countNew = 0;

            for (int i = 0; i < newArray.length; i++) {
                if (newArray[i] != null) {
                    resultArray[countNew] = newArray[i];
                    countNew++;
                }
            }
            return resultArray;
        }

        return array;

    }
}

