package com.zia.exception;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        Address ad1 = new Address("EdiBazar", "HitechCity", "445566789");
        Address ad2 = new Address("SantoshNagar", "Kokapet", "223344567");
        Address ad3 = new Address("MoinBagh", "Gachibowli", "123456789");

        List<Address> list = new LinkedList<>();
        list.add(ad2);
        list.add(ad1);
        list.add(ad3);
        list.add(ad2);
        list.remove(ad1);
        System.out.println(list);

        List<Address> addrList = new ArrayList<>();
        list.add(ad1);
        list.add(ad3);
        System.out.println(list);
        System.out.println(list.equals(list));
        boolean result = list.contains(ad3);
        System.out.println(result);
    }
}




