package Com.Oops_Concept;

public class ClassesAndObject {  //class
    public static void main(String[] args) {
        Person p1 = new Person();   // creating object
        p1.name = "Pradip";
        p1.age = 22;
        System.out.println(p1.name+" "+p1.age);
        Person p2 = new Person();
        p2.name="kahi pn";         //call by variable...
        p2.age=17;
        System.out.println(p2.name+ " "+p2.age);


    }
}

    class Person{  // another class
        String name;
        int age;

    }

