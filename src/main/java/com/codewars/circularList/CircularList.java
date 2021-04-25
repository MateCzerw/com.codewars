package com.codewars.circularList;


import java.util.ArrayList;
import java.util.List;

class CircularList<T> {

    private List<T> list;
    private int iterator;

    CircularList(final T... elements){
        if(elements.length == 0) throw new RuntimeException();
        this.list = new ArrayList<T>(List.of(elements));
        iterator = -1;
    }

    T next() {
        iterator = (iterator + 1) % list.size();
        T element = list.get(iterator);
        return element;
    }

    T prev() {
        if(iterator <= 0) iterator = list.size() - 1;
        else iterator = (iterator - 1) % list.size();
        T element = list.get(iterator);
        return element;
    }
}

