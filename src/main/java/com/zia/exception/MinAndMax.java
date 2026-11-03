package com.zia.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMax {
    public static Integer findMin(List<Integer> list){
        if(list == null||list.isEmpty())
            return Integer.MAX_VALUE;
            return Collections.min(list);

        }

    public static Integer findMax(List<Integer> list){
        if(list == null||list.isEmpty())
            return Integer.MIN_VALUE;
            return Collections.max(list);

        }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(99);
        System.out.println("Min:" + findMin(list));
        System.out.println("Max:" +findMax(list));

    }
}
