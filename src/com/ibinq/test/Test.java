package com.ibinq.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Test {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        Vector<Integer> v = new Vector<Integer>(12);
        List<Integer> arrayList = new ArrayList<Integer>(11);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println( arrayList.get(2));
        arrayList.set(2,12);
        System.out.println( arrayList.get(2));
        System.out.println( arrayList.size());
        System.out.println(v.capacity());
    }
}
