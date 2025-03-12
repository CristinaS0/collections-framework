package com.codeforall.online.test;

import com.codeforall.online.collections.MySet;

import java.util.Arrays;

public class MySetTest {
    public static void main(String[] args) {
        MySet set1 = new MySet(10);

        System.out.println(" -> add() method ----- ");
        set1.add("Deolinda");
        set1.add("Manuel");
        set1.add("Josefina");
        set1.add("Clemêncio");
        set1.add("Bernardete");
        System.out.println("The collection elements are : " + Arrays.toString(set1.getElements()));
        System.out.println(" ");

        System.out.println(" -> size() method ----- ");
        System.out.println("The queue has this size : " + set1.size());
        System.out.println(" ");

        System.out.println(" -> remove() method ----- ");
        System.out.println(set1.remove("Josefina"));
        System.out.println(set1.remove("Felipe"));
        System.out.println("The collection elements are : " + Arrays.toString(set1.getElements()));
        System.out.println(" ");

        System.out.println(" -> contains() method ----- ");
        System.out.println("Expected result false. We are looking for Vitor.");
        System.out.println("The test result is : " + set1.contains("Vitor"));//because Vitor was removed in the previous
        System.out.println("Contains Clemêncio? " + set1.contains("Clemêncio"));
        System.out.println("The collection elements are : " + Arrays.toString(set1.getElements()));
        System.out.println(" ");

        System.out.println("  -> isEmpty() method ----- ");
        System.out.println(set1.isEmpty());
        System.out.println("The collection elements are : " + Arrays.toString(set1.getElements()));
        System.out.println(" ");

        System.out.println(" -> clear() method ----- ");
        System.out.println(set1.clear());
        System.out.println("The collection elements are : " + Arrays.toString(set1.getElements()));
        System.out.println(" ");

        //set1.add("Abílio");

        System.out.println("  -> isEmpty() method ----- ");
        System.out.println(set1.isEmpty());
        System.out.println("The collection elements are : " + Arrays.toString(set1.getElements()));
        System.out.println(" ");

    }
}
