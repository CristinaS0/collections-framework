package com.codeforall.online.collections;

public interface List extends Collection {
    Object get(int index);
    int indexOf(Object o);
    List subList(int fromIndex, int toIndex);


}
