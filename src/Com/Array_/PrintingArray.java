package Com.Array_;
// printing and addition of an array element

public class PrintingArray {
    public static void main(String[] args) {
        int a[]={ 10, 20,29,48,57,48};
        int sum=0;
        int mul=1;
        int avg;
        System.out.println(a.length);
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+" :"+i);
             sum=sum+a[i];
             mul=mul*a[i];


        }
        System.out.println("Avarage of an Array : ");
        System.out.println("Addition of an Array element: "+sum);
        System.out.println("Multiplication of an Array element: "+mul);


    }
}
