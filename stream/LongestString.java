package org.git.stream;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
//        String[] str = {"wasim","zidanee","zaid"};
//
//        HashMap<String,Integer> map = new HashMap<>();
//        int[] arr = new int[str.length];
//
//        for(int i=0;i<str.length;i++){
//            map.put(str[i], str[i].length());
//            arr[i] = str[i].length();
//        }
//
//
//        OptionalInt max = Arrays.stream(arr).max();
//        System.out.println(max.getAsInt());
//
//        for(Map.Entry<String,Integer> m1 : map.entrySet()){
//            if ( m1.getValue() == max.getAsInt()){
//                System.out.println(m1.getKey());
//            }
//        }
        String[] str = {"wasim","zidanee","zaid"};

        Optional<String> longest = Arrays.stream(str).reduce((s1,s2) -> s1.length() < s2.length() ? s1:s2);

        System.out.println(longest.get());


    }
}
