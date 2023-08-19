package org.git.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlapMapExample {
    public static void main(String[] args) {
        List<Integer> i1 = Arrays.asList(1,2,3,4);
        List<Integer> i3 = Arrays.asList(1,2,3,4);
        List<Integer> i2 = Arrays.asList(1,2,3,4);

        List<List<Integer>> lists = Arrays.asList(i1,i2,i3);


        Set<Integer> list= lists.stream().flatMap(s -> s.stream()).collect(Collectors.toSet());
        System.out.println(list);
    }
}
