package com.integration.app;

import java.util.ArrayList;

public class TDList {

    private ArrayList<String> list = new ArrayList<String>();

    public void add(String s){
        list.add(s);
    }

    public void remove(int x){
        list.remove(x);
    }

    public ArrayList<String> getList(){
        return list;
    }
}
