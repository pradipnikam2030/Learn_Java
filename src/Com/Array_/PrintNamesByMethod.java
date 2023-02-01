package Com.Array_;

public class PrintNamesByMethod {
    public static void main(String[] args) {

        String [] names={"Pradip", "Siddhant"};
        printNames(names);
           // System.out.println(a[i]);

    }
    private static void printNames(String names[])
    {
     for (int i=0; i<names.length; i++)
     {
         System.out.println(names[i]);
     }
    }

}
