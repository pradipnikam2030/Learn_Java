package Com.Array_;

public class LeaderElement {
    public static void main(String[] args) {
        int []a={22,33,11,15,9,15,13};
        for (int i=0; i<a.length; i++)
        {
            boolean flag=false;
            for (int j=i+1; j<a.length; j++)
            {
                if (a[j]>a[i])
                    flag=true;
                break;

            }
            if(!flag)
                System.out.println(a[i]);
        }
    }
}
