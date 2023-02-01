package Com.Oops_Concept;

public class ParameterizedConstructor {
    int num=5, sum=0;
    public ParameterizedConstructor(int num, int abc){
        this.num=num;    ///this keyword ==> point to the instance variable...
        sum=abc;
        System.out.println("hello");
    }
    public void print()
    {
        System.out.println("Hii");
    }
}
