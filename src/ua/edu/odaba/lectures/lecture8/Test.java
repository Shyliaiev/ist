package ua.edu.odaba.lectures.lecture8;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        HashMap hashMap = new HashMap();

//        String[] students = {"Lukasevich", "Podwalnyi", "Baglay"};
//
//        System.out.println(students[2]);
//
//        String[] clone = students.clone();
//        students = new String[4];
//
//        System.out.println(students[2]);
//
//        for (int i = 0; i < clone.length; i++) {
//            students[i] = clone[i];
//        }
//        students[3] = "me";
//
//        System.out.println(students[2]);

        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(45);
        arrayList.add(12);
        arrayList.add(1);

        System.out.println(arrayList.indexOf(45));

        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(6);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(24);
        hashSet.add(24);
        hashSet.add(24);
        hashSet.add(24);
        hashSet.add(24);
        hashSet.add(24);
        hashSet.add(9);
        System.out.println(hashSet);

        System.out.println("arraylist " + arrayList);
        arrayList.add(2);
        System.out.println("arraylist " + arrayList);
        treeSet.addAll(arrayList);
        System.out.println("treeSet " + treeSet);
        treeSet.add(4);
        System.out.println("treeSet " + treeSet);

        hashMap.put("Ukraine", "Kyiv");
        hashMap.put("France", "Paris");
        hashMap.put("Spain", "Madrid");

        System.out.println(hashMap);
        System.out.println(hashMap);
    }
}
