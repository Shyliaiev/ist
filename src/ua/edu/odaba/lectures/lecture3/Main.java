package ua.edu.odaba.lectures.lecture3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //this single line is comment

        /* this
        is
        multiline
        comment
         */

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        System.out.println(array1);
        System.out.println(array2);

        System.out.println(array1.equals(array2));

        System.out.println(Arrays.equals(array1, array2));

        System.out.println("____________________");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array2 = array1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println(array1.equals(array2));

        System.out.println("____________________");

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);

        array1[1] = 5;

        System.out.println(Arrays.toString(array1));

        System.out.println(array1.length);

        Cat barsik = new Cat();
        barsik.setAge(3);
        barsik.setName("Barsik");
        barsik.setSex("male");
        barsik.setBreed("Ukrainian yard");

        System.out.println(barsik.getName());

        barsik.introduce();

        Cat listik = new Cat();
        listik.setName("Listik");

        listik.introduce();
    }
}
