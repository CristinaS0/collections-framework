package com.codeforall.online.collections;

import java.util.Arrays;

public class MyQueue implements Queue{
    private Object[] elements;

    private int size;
    private int numberOfElements; //this variable is number of elements inside the collection, not the positions

    public MyQueue(int size) {
        this.elements = new Object[size];
        this.numberOfElements = 0;
        this.size = size;
    }

    public boolean offer(Object element) {
        if(numberOfElements < elements.length) {
            return add(element);
        }
        return false;
    }

    public Object peek() {
        if(elements[0] != null) {
            return elements[0];
        }
        return null;
    }

    public Object poll() {
        var element = elements[0];
        remove(element);
        return element;
    }

    public int size() {
        return this.size;
    }

    public boolean add(Object element) {
        if(numberOfElements < elements.length && elements[numberOfElements] == null) {
            elements[numberOfElements] = element;
            numberOfElements++;
            return true;
        }
        return false;
    }

    public boolean remove(Object element) {
        if(elements[0] == element){
            for (int i = 0; i < this.numberOfElements; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.numberOfElements--;
            return true;
        }
        return false;
    }

    public boolean contains(Object element) {
        for (int i = 0; i < this.numberOfElements; i++) {
            if (this.elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.numberOfElements == 0) {
            return true;
        }
        return false;
    }

    public boolean clear() {
            for (int i = 0; i < this.elements.length - 1; i++) {
                this.elements[i] = null;
            }
            if (elements[0] == null) {
                this.numberOfElements = 0;
                return true;
            }
        return false;
    }

    //Getters
    public Object[] getElements() {return elements;}

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return getElements() != null ? Arrays.toString(getElements()) : "[]";
    }
}
