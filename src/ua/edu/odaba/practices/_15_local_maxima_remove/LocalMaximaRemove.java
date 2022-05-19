package ua.edu.odaba.practices._15_local_maxima_remove;

import java.util.*;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{-3, 2, 4, 3, 5, 12, 8};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {

        int numberOfLocalMaximas = 0;

        if (array[0] > array[1]) {
            numberOfLocalMaximas++;
        }
        if (array[array.length - 1] > array[array.length - 2]) {
            numberOfLocalMaximas++;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                numberOfLocalMaximas++;
            }
        }

        int[] result = new int[array.length - numberOfLocalMaximas];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] > array[1]) {
                continue;
            } else if (i == array.length - 1 && array[array.length - 1] > array[array.length - 2]) {
                continue;
            } else if (i != 0 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                continue;
            }
            result[j] = array[i];
            j++;
        }


        return result;
    }
}

