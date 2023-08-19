package org.git.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfChar {
    public static void main(String[] args) {
        String str = "wasimm";

        //groupBy will return a map
        Map<String, List<String>> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s));
        System.out.println(map);

        //Function.identity will represent each char
        Map<String, Long> map1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);




    }
}
