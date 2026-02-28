package com.integration.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDTest {

    @Test
    public void testAdd() {
        TDList list = new TDList();

        String testString = "This is a test string";
        list.add(testString);

        assertEquals(testString, list.getList().get(0));
    }

    @Test
    public void testRemove() {
        TDList list = new TDList();

        String tempString = "This is a string";
        list.add(tempString);
        list.add(tempString);
        list.add(tempString);

        int listLength = list.getList().size();
        list.remove(0);

        assertEquals(listLength - 1, list.getList().size());
    }
}
