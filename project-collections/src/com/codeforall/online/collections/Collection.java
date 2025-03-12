package com.codeforall.online.collections;

public interface Collection {
    int size();
    boolean add(Object element);
    boolean remove(Object element);
    boolean contains(Object element);
    boolean isEmpty();
    boolean clear();


}
