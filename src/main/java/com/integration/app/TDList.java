package com.integration.app;

import java.util.ArrayList;

/**
 * Creates a To-DO list using an ArrayList.
 *
 * @author Ryan Bookram
 * @version 1.0
 */
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
