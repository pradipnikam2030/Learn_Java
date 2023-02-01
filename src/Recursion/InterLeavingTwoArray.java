package Recursion;

public class InterLeavingTwoArray {

    public static void main(String[] args)
    {
        char[] a= {'a','b','c','d','e','f','g'};
        char[] b= {'w','x','y','z'};

        myCode(a,b);
    }
    //EndOfMainMethod
    private static void myCode(char[] a,char[] b)
    {
        char[] c=new char[a.length+b.length];
        int index=0;
        iLoop(0, index, a, b, c);
        jLoop(0, c);
    }

    private static void jLoop(int j, char[] c) {
        if (j<c.length)
        {
            System.out.print(c[j]+" ");
            jLoop(j+1, c);
        }
    }

    private static void iLoop(int i, int index, char[] a, char[] b, char[] c)
    {
        if(i<a.length||i<b.length)
        {
            if(i<a.length)
                c[index++]=a[i];
            if(i<b.length)
                c[index++]=b[i];
            iLoop(++i, index, a,b,c);
        }
    }
}
