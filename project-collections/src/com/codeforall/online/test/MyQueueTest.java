package com.codeforall.online.test;

import com.codeforall.online.collections.MyQueue;

import java.util.Arrays;

public class MyQueueTest {

    public static void main(String[] args) {

        System.out.println(" -> offer() method ----- ");
        //should return a boolean representing if the operation was successful; it should add an object to the com.codeforall.online.collections.Queue.
        MyQueue queue1 = new MyQueue(10);
        System.out.println(queue1.offer("João"));
        System.out.println(queue1.offer("Pedro"));
        System.out.println(queue1.offer("Pedro"));
        System.out.println(queue1.offer("Felipe"));
        System.out.println("The collection elements are : " + Arrays.toString(queue1.getElements()));
        System.out.println(" ");

        System.out.println(" -> peek() method ----- ");
        System.out.println("The object at the head of the queue is : " + queue1.peek());
        System.out.println(" ");

        System.out.println(" -> poll() method ----- ");
        System.out.println(queue1.poll());
        System.out.println("The collection elements are : " + Arrays.toString(queue1.getElements()));
        System.out.println(" ");

        System.out.println(" -> add() method ----- ");
        queue1.add("Catarina");
        System.out.println("The collection elements are : " + Arrays.toString(queue1.getElements()));
        System.out.println(" ");

        System.out.println(" -> size() method ----- ");
        System.out.println("The queue has this size : " + queue1.size());
        System.out.println(" ");

        System.out.println(" -> remove() method ----- ");
        System.out.println(queue1.remove("Pedro"));
        System.out.println(queue1.remove("Felipe"));
        System.out.println("The collection elements are : " + Arrays.toString(queue1.getElements()));
        System.out.println(" ");

        System.out.println(" -> contains() method ----- ");
        System.out.println("Expected result false. We are looking for Vitor.");
        System.out.println("The test result is : " + queue1.contains("Vitor"));//because Vitor was removed in the previous
        System.out.println("Contains Catarina? " + queue1.contains("Catarina"));
        System.out.println("The collection elements are : " + Arrays.toString(queue1.getElements()));
        System.out.println(" ");

        System.out.println("  -> isEmpty() method ----- ");
        System.out.println(queue1.isEmpty());
        System.out.println("The collection elements are : " + Arrays.toString(queue1.getElements()));
        System.out.println(" ");

        System.out.println(" -> clear() method ----- ");
        System.out.println(queue1.clear());
        System.out.println("The collection elements are : " + Arrays.toString(queue1.getElements()));
        System.out.println(" ");

        System.out.println("  -> isEmpty() method ----- ");
        System.out.println(queue1.isEmpty());
        System.out.println("The collection elements are : " + Arrays.toString(queue1.getElements()));
        System.out.println(" ");

    }
}
