package Com.Array_;

public class FindElementTimeComlple {
    public static void main(String[] args) {
        int []a={11,22,33,44,55,66,77,88};
        int start=0;
        int end=a.length-1;
        int ele=59;
        while(true)
        {
            int mid=(start+end)/2;
            if(a[mid]==ele) {
                System.out.println(mid);
                break;
            }
            else if(ele>a[mid])
                start=mid+1;
            else
                end=mid-1;
            if(end<start) {
                System.out.println("not found");
                break;
            }
        }

    }
}
