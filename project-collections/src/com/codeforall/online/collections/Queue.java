package com.codeforall.online.collections;

public interface Queue extends Collection {
    boolean offer(Object element);
    Object peek();
    Object poll();
}
