package org.git.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateChar {
    public static void main(String[] args) {
        String s = "wasimmmw";

//        Map<String,Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        for(Map.Entry<String,Long> map1 : map.entrySet()){
//            if(map1.getValue() > 1){
//                System.out.println(map1.getKey() +" "+ "is repeated" + " " + map1.getValue() + " " + "times");
//            }
//        }

        List<String> list = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue()> 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
