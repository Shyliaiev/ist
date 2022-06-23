package ua.edu.odaba.practices._12_max;

public class MaxMethod {

    public static void main(String[] args) {
        int[] values = new int[]{-2, 0, 10, 5};
        int result = MaxMethod.max(values);
        System.out.println(result);
    }

    public static int max(int[] values) {

        int max = values[0];

        try {

            for (int i = 0; i < values.length; i++) {
                if (values[i] > max) {
                    max = values[i];
                }
            }

            return max;

        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }



    }
}
