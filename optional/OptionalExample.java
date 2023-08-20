package org.git.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String str = null;

        if(str == null){
            System.out.println("The object is null");
        }
        else {
            System.out.println(str.length());
        }

        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
        // System.out.println(optional.get());
        System.out.println(optional.orElse("The object is null"));



    }
}
