package String_;

import javax.swing.*;

public class ReverseString {
    public static void main(String[] args) {
        String s="You all are very very very good students";
        String []sa=s.split(" ");
        int i=0;
        int j= sa.length-1;
        while(i<j)
        {
            String temp=sa[i];
            sa[i]=sa[j];
            sa[j]=temp;
            i++;j--;
        }

        for (String data:sa)
            System.out.print(data+" ");

//        for (int k=0; k<sa.length; k++)
//        {
//            String p=sa[k];
//            char[] ch=p.toCharArray();
//            int i=0;
//          int   j=ch.length-1;
//            while (i<j){
//                char temp1=ch[i];
//                ch[i]=ch[j];
//                ch[j]=temp1;
//                i++;
//                j--;
//            }
//            String q=new String(ch);
//            sa[k]=q;
//
//        }
//        System.out.println();
//        for (String data:sa)
//            System.out.print(data+" ");
   }


}
