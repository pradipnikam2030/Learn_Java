package Com.Oops_Concept;


public class MyClass
{
    public static void main(String[] args)
    {
        //inheri.21
        X obj1 = new Z();
        Y obj2 = (Y) obj1;
        System.out.print(obj1.method1() + " and ");
        System.out.print(obj2.a);
    }
}

class X {
    int a = 100;
    int method1() {    return a;    }
}
class Y extends X {
    int a = 200;
    int method1() {    return a;    }
}
class Z extends Y {
    int a = 300;
    int method1() {    return a;    }
}

