package com.codeforall.online.collections;

public class MySet implements Set {
    private Object[] elements;
    private int size;
    private int numberOfElements; //this variable is number of elements inside the collection, not the positions

    public MySet(int size) {
        this.elements = new Object[size];
        this.numberOfElements = 0;
        this.size = size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean add(Object element) {
        if(this.contains(element)) {
            return false;
        } else {
            if (this.numberOfElements < this.elements.length) {
                elements[numberOfElements] = element;
                numberOfElements++;
                return true;
            }
            return false;
        }
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

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < this.numberOfElements; i++) {
            if (this.elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (this.numberOfElements == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean clear() {
        for (int i = this.numberOfElements; i >= 0; i--) {
            remove(elements[i]);
            if (i == 0 && elements[i] == null) {
                return true;
            }
        }
        return false;
    }

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
