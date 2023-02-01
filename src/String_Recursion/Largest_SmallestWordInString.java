package String_Recursion;

public class Largest_SmallestWordInString {
    public static void main(String[] args)
    {
        String s1 = "welcome to hefshine soft pvt ltd";
        String[] sa=s1.split(" ");
        iLoop(sa, 0);
        System.out.println("smallest word : "+sa[0]);
        System.out.println("largest word : "+sa[sa.length-1]);
    }
    private static void iLoop(String [] sa, int i)
    {
        if(i<sa.length)
        {
            jLoop(sa, i,i+1);
            iLoop(sa, ++i);
        }
    }
    private static void jLoop(String[] sa, int i, int j)
    {
        if(j<sa.length)
        {
            if(sa[i].length()>sa[j].length())
            {
                String temp=sa[i];
                sa[i]=sa[j];
                sa[j]=temp;
            }
            jLoop(sa, i, ++j);
        }
    }
}
