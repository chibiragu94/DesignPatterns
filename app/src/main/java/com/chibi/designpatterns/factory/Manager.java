package com.chibi.designpatterns.factory;

public class Manager implements Type{
    @Override
    public String getSalaryRange() {
        return "30L";
    }
}
