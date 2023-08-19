package org.git.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
//        String s ="wasimwas";
//        int count =0;
//        char ch = 0;
//        for(int i=0;i<s.length();i++){
//            count =0;
//            ch = s.charAt(i);
//            for(int j=i+1;j<s.length();j++){
//                if(ch == s.charAt(j)){
//                    count ++;
//                    break;
//                }
//            }
//            if(count ==0){
//                System.out.println(ch + " "+ "is the first non-repeative char");
//                break;
//            }
//        }

        String s ="wasimwasi";
      Optional<String> firstNon = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst();

      if(firstNon.isPresent()){
          System.out.println(firstNon.get());

      }


    }
}
