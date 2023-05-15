package com.company;

import java.util.ArrayList;
import java.util.*;

public class Main {

    static List<Integer> list = new ArrayList<Integer>();

    static int k = 1;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(20);
        list.add(30);

        list.add(70);
        list.add(90);
        list.add(80);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                k = k * list.get(i);
            }
        }
        System.out.println(k);
        List<Integer> al = new ArrayList<>();
        int a = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {

            } else {
                al.add(list.get(i));
            }
        }

        System.out.println(al);
    }

}
