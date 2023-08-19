package org.git.methodreference;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


interface EmpRefManager{
    EmpRef getEmp();

}
class EmpRef {
    int id;
    String name;
    int salary;

    public EmpRef(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public EmpRef() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getEmp(){
        System.out.println("in get employee");
    }
}
public class MethodReferenceDemo {

    public void m1(){
        System.out.println("In m1");
    }

    public static void m2(){
        System.out.println("In static m2");
    }

    public static void main(String[] args) {

//        MethodReferenceDemo.m2();
//
//        //MethodReferenceDemo::m1; instance method reference
//        //MethodReferenceDemo::m2; static method reference
//
//        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
//        methodReferenceDemo.m1();

        EmpRef empRef1 = new EmpRef(1,"wasim",5000);
        EmpRef empRef2 = new EmpRef(2,"zidane",15000);
        EmpRef empRef3 = new EmpRef(3,"zaid",50000);

        List<EmpRef> empRefList = Arrays.asList(empRef1,empRef2,empRef3);


         // anonomous
//        empRefList.stream().forEach( new Consumer<EmpRef>() {
//            @Override
//            public void accept(EmpRef e) {
//                System.out.println(e.id);
//            }
//        });

        //Lambda
        //empRefList.stream().forEach((e) -> System.out.println(e.id));


        //static method reference
        //empRefList.stream().forEach(MethodReferenceDemo::print);

        empRefList.stream().forEach(System.out::println);

        EmpRefManager empRefManager = EmpRef::new;

        empRefManager.getEmp().getEmp();

        empRefManager.getEmp().getEmp();

    }

    public static void print(EmpRef empRef){
        System.out.println(empRef.id);
    }


}

