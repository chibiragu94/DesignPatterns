package com.chibi.designpatterns.iteratorPattern;

import java.util.ArrayList;

public class SampleIterator implements Iterator{

    private ArrayList<String> arrayList;
    private int position = 0;

    public SampleIterator(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean isHasNext() {
        return position < arrayList.size();
    }

    @Override
    public String next() {
        String value = arrayList.get(position);
        position++;
        return value;
    }
}
