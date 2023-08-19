package org.git.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,5,7,2,3,5);


        Optional<Integer> secondHighest = integers.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(secondHighest.get());


        //int [] arr = new int[] {1,5,7,2,3,5};
//        for(int i =0;i<arr.length;i++){
//            for(int j=i+1 ;j<arr.length;j++){
//                if(arr[i] < arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//      for(int i : arr){
//          System.out.println(i);
//      }


    }
}
