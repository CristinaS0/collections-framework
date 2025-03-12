package com.codeforall.online.collections;

import java.util.Arrays;

public class MyList implements List {
    private Object[] elements;
    private int size;

    private int numberOfElements; //this variable is number of elements inside the collection, not the positions

    public MyList(int size) {
        this.elements = new Object[size];
        this.numberOfElements = 0;
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    public boolean add(Object element) {
        if (this.numberOfElements < this.elements.length) {
            elements[numberOfElements] = element;
            numberOfElements++;
            return true;
        }
        return false;
    }

    public boolean remove(Object element) {
        for (int i = 0; i < this.numberOfElements; i++) {
            if (this.elements[i].equals(element)) {
                for (int j = i; j < this.numberOfElements - 1; j++) {
                    this.elements[j] = this.elements[j + 1];
                }
                elements[this.numberOfElements - 1] = null;
                numberOfElements--;
                return true;
            }
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
        for (int i = this.numberOfElements; i >= 0; i--) {
            remove(elements[i]);
            if (i == 0 && elements[i] == null) {
                return true;
            }
        }
        return false;
    }

    public Object get(int index) {
        if (index < 0 || index > numberOfElements) {
            return null;
        }
        return elements[index];
    }

    public int indexOf(Object element) {
        for (int i = 0; i < numberOfElements; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1; //change to "-1" because 0 is the first position of the array/collection
    }

    public List subList(int fromIndex, int toIndex) {
        MyList subList = new MyList(toIndex - fromIndex + 1);
        for (int i = fromIndex; i <= toIndex; i++) {
            subList.add(elements[i]);
        }
        return subList;
    }

    @Override
    public String toString() {
        return elements != null ? Arrays.toString(elements) : "[]";
    }

    //Getters
    public Object[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }
}
