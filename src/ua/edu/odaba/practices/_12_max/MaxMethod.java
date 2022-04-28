package ua.edu.odaba.practices._12_max;

public class MaxMethod {

    public static void main(String[] args) {
        int[] ints = {15, 2, 13, -4, -1};
        System.out.println(max(ints));
    }

    public static int max(int[] values) {

        int maxNum = values[0];

//        for (int i = 0; i < values.length; i++) {
//            if (values[i] > maxNum) {
//                maxNum = values[i];
//            }
//        }

        for (int j : values) {
            if (j > maxNum) {
                maxNum = j;
            }
        }

        return maxNum;

    }
}