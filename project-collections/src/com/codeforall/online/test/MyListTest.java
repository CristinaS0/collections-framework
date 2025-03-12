package com.codeforall.online.test;

import com.codeforall.online.collections.MyList;

import java.util.Arrays;

public class MyListTest {

    //Create a separate package called test inside the project’s main packages, like com.codeforall.online.test.
    //For better organisation, you can create one test class for each implementation in this package, each with a main() method,
    //where you instantiate an object of the tested class, and invoke its methods, with the arguments you see fit.

    public static void main(String[] args) {

        MyList lista = new MyList(3);
        System.out.println("The list has this size : " + lista.size());
        System.out.println(" ");

        System.out.println(lista.add("João"));
        System.out.println(lista.add("Alberto"));
        System.out.println(lista.add("Joaquim"));
        System.out.println(lista.add("Fernando"));
        System.out.println("After adding elements, the collection elements are : " + Arrays.toString(lista.getElements()));
        System.out.println(" ");

        System.out.println(" -> remove() method ----- ");
        System.out.println(lista.remove("Vitor"));
        System.out.println(lista.remove("Joaquim"));
        System.out.println("The collection elements before removing are : " + Arrays.toString(lista.getElements()));
        System.out.println(" ");

        System.out.println(" -> contains() method ----- ");
        System.out.println("Expected result false. We are looking for Vitor.");
        System.out.println("The test result is : " + lista.contains("Vitor"));//because Vitor was removed in the previous
        System.out.println("Contains Alberto ? " + lista.contains("Alberto"));
        System.out.println("The collection elements are : " + Arrays.toString(lista.getElements()));
        System.out.println(" ");

        System.out.println("  -> isEmpty() method ----- ");
        System.out.println(lista.isEmpty());
        System.out.println("The collection elements are : " + Arrays.toString(lista.getElements()));
        System.out.println(" ");

        System.out.println(" -> clear() method ----- ");
        System.out.println(lista.clear());
        System.out.println("The collection elements are : " + Arrays.toString(lista.getElements()));
        System.out.println(" ");

        System.out.println("  -> get() method ----- ");
        lista.add("Tiago");
        lista.add("Andreia");
        lista.add("António");
        System.out.println("The collection elements are : " + Arrays.toString(lista.getElements()));
        System.out.println("The object at position 2 is : " + lista.get(2));
        System.out.println(" ");

        System.out.println(" -> indexOf() method ----- ");
        String nome = "Andreia";
        System.out.println("The element " + nome + " is at position : " + lista.indexOf(nome));
        System.out.println(" ");

        System.out.println(" ->sublist(int, int) method ----- ");
        System.out.println("The sublist from position 0 to 1 is : " + lista.subList(0,1));
        System.out.println(" ");
        
    }
}
