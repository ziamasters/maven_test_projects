package com.zia.exception;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class StackAndQueueImplPractice {
    public static void main(String[] args) {
        Stack<String> S = new Stack<>();
        S.push("Zia");
        S.push("Anas");
        S.push("Shafi");
        System.out.println(S);
        System.out.println(S.pop());
        System.out.println(S.search("Zia"));
        Queue<String> Q = new PriorityQueue<>();
        Q.add ("Zia");
        Q.add("Anas");
        Q.add("Shafi");
        System.out.println(Q);
        System.out.println(Q.remove());
        System.out.println(Q.remove("Anas"));

    }
}
