package Com.Array_;

public class FindElement {
    public static void main(String[] args) {
        int []a={10,20,30,40,50};
        int ele=40;
        boolean flag=false;
        for (int i=0; i<a.length; i++)
        {
            if(a[i]==ele)
            {

                flag=true;

            }
        }
        if(!flag)
            System.out.println("not found");
        else
            System.out.println("found");
    }
}
