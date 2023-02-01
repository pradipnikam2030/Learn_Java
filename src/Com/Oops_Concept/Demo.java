package Com.Oops_Concept;

import Com.Core_Java.Demo2;

//among two classes in same packages...
public class Demo {
    public static void main(String[] args) {
        Demo1.pradip();
        Demo2.name();
        Demo.sameclass();
    }
    public static void sameclass()
    {
        System.out.println("method call in same class and same package " +
                "\n"+"with public, private , and protected method is possible");
    }
}
