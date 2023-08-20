package org.git.functionalinterface;

interface functionalInterface{
    void demo();

    default void defaultMethod(){
        System.out.println("In default Method");
    }

    static void staticMethod(){
        System.out.println("In static");
    }
}

interface functionalInterface2{

    default void defaultMethod(){
        System.out.println("In default Method2");
    }
}
public class FunctionalInterfaceExample /*implements functionalInterface*/implements functionalInterface,functionalInterface2 {


   public void defaultMethod(){
       functionalInterface2.super.defaultMethod();
   }
    // implementing the interface
//    @Override
//    public void demo() {
//        System.out.println("in demo");
//    }

    public static void main(String[] args) {


        // anonomous class
//        functionalInterface fi = new functionalInterface() {
//            @Override
//            public void demo() {
//                System.out.println("in demo");
//            }
//        };
//
//        fi.demo();


//        //using lambda function
//        functionalInterface fi = () -> System.out.println("in demo");
//        fi.demo();

        FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample();
        functionalInterfaceExample.defaultMethod();

    }

    @Override
    public void demo() {
        System.out.println("in demo");
    }



//    @Override
//    public String defaultMethod() {
//        //return functionalInterface.super.defaultMethod();
//        return functionalInterface2.super.defaultMethod();
//
//    }


}
