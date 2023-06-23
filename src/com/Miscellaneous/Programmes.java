package com.Miscellaneous;

import java.util.*;
import java.util.stream.Collectors;

public class Programmes {
    public static void main(String[] args) {
        List<Integer> al= new ArrayList<>() ;
        List<Integer> al1= new ArrayList<>() ;
        HashMap<Integer,Integer> hm = new HashMap<>();
        al.add(20);
        al.add(12);
        al.add(34);
        al.add(-3);
        al.add(56);
        al.add(12);
        al.add(8);
        al.add(87);
        al.add(12);
        al.add(0);
        al.add(20);

        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (Integer number : al) {
            if (!uniqueElements.add(number)) {
                // If element is already present in uniqueElements set,
                // it is a duplicate and is added to duplicates set
                duplicates.add(number);
            }
        }

       for(int i = 0; i < al.size();i++){
           if(duplicates.contains(al.get(i))) {
               System.out.println(al.get(i)+" is present at "+i); 
           }
       }

    }
}
