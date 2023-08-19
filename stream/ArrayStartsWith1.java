package org.git.stream;

import java.util.Arrays;
import java.util.List;

public class ArrayStartsWith1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,21,13,34,19);

//        arr.stream().map(n -> n + "").filter(n -> n.startsWith("1")).forEach(System.out::println);

        int firstDigit = 0;

        for(int i=0;i<arr.size();i++){
            int number =arr.get(i);
            while (number!=0){
                firstDigit = Math.abs(arr.get(i) %10);
                number = number/10;
            }
            System.out.println(firstDigit);

        }


    }
}
