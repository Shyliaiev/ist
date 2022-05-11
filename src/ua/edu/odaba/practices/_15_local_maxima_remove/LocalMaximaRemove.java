package ua.edu.odaba.practices._15_local_maxima_remove;

import java.util.*;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int[] result;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[i - 1] || array[i] < array[i + 1]) {

            }
        }




        return result;
    }
}

