package com.company;

import java.util.*;

public class MaintainOrder {

    public static  int[] removeDuplicates(int[] ints){
        Set<Integer> inter = new TreeSet<>();
        for(Integer integer : ints){
            inter.add(integer);
        }
        int [] result = new int[inter.size()];
        int index = 0;
        for(Integer integer : inter){
            result[index] = integer;
            index ++;
        }
        return result;
    }
    public Collection<Integer> removeDuplicates(List<Integer> ints){
        Set<Integer> integerSet= new TreeSet<>();
       integerSet.addAll(ints);

        return integerSet;


    }

    public static void main(String[] args) {
        int [] ints = {1,2,5,5,2,3,3,4,4};
        int [] result = removeDuplicates(ints); // call set method
        for(Integer integer : result){
            System.out.print(integer);
        }
    }
}
