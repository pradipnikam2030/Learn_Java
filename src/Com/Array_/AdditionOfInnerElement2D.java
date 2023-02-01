package Com.Array_;

public class AdditionOfInnerElement2D {
    public static void main(String[] args) {
        int [][]b={
                {1,2,3,4},
                {5,6,7,8},
                {9,4,2,5},
                {7,2,4,9}
        };
        double innerSum=0;
        int outerSum=0;
        double counter=0;
        int count=0;
        for (int i=0; i<b.length; i++)
        {
            for (int j=0; j<b[i].length; j++) {
                if (i!=0&&i!=b.length-1&&j!=0&&j!=b.length-1) {
                    innerSum=innerSum+ b[i][j];
                    counter++;
                }
                if(i==0||i==3||j==0||j==3)
                {
                    outerSum = outerSum + b[i][j];
                    count++;

                }
            }
        }
        System.out.println("inner sum : "+innerSum);
        System.out.println("outer sum : "+outerSum);
        System.out.println("inner avarage : " +innerSum/counter);
        System.out.println("outer avarage : " +outerSum/count);
    }

}
