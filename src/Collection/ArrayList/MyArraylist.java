package Collection.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MyArraylist extends Object{
    public static void main(String[] args) {
        User al=new User();
          al.add(10);
          al.add(20);
          al.add(30);
          al.add(20);
//Collections.sort();


//        ArrayList<String> als = new ArrayList<String>(al);
System.out.println(al.contains(30));

       al.set(3, 100);
        int index=al.indexOf(30);
        System.out.println(index);
        int lastIndex=al.lastIndexOf(20);
        System.out.println(lastIndex);
        System.out.println(al);
    }
}

class User{
    private int[] a=new int[3];
    int index=0;
    public void remove(int userInd)
    {
        if(userInd<0||userInd>=index)
            throw new ArrayIndexOutOfBoundsException();
          for (int i=userInd; i<index; i++)
              a[i]=a[i+1];
          index--;
    }
    public  User clone()
    {
        User al=new User();
        for (int i=0; i<index; i++)
            al.add(a[i]);
        return al;
    }
    // AddAt Method....
     public void Addat(int userIndex, int data)
     {
         if (index>=a.length)
             grow();
         int i=index;
         for (; i>userIndex; i--)
         a[i]=a[i-1];
         a[i]=data;
         index++;
     }
    // Remove Method
    public void removeEle(int userIndex)
    {
        if (userIndex<0||userIndex>=index)
            throw new ArrayIndexOutOfBoundsException();
        for (int i=0; i<index; i++)
             a[i]=a[i+1];
    }
    // Contain of method
    boolean contains(int data)
    {
        for (int i=0; i<index; i++)
            if (a[i]==data)
                return true;
        return false;
    }
    // set index method
      public void set(int userindex, int data)
      {
          if (userindex<0||userindex>index)
              throw new ArrayIndexOutOfBoundsException();
          a[userindex]=data;
      }

    // Last index of Method
     public  int lastIndexOf(int data)
     {
         for (int i=index-1; i>=0; i--)
         {
             if (a[i]==data)
                 return i;
         }
         return -1;
     }

     // Index of Method...
    public int indexOf(int obj)
    {
        for (int i=0; i<index; i++)
        {
            if (a[i]==obj)
                return i;
        }
        return -1;
    }

    // Add Method..
    void add(int data)
    {
        if (index>a.length)
            grow();
          a[index]=data;
          index++;
    }
    // to String method
    public String myToString()
    {
        String s="[";
        for(int i=0; i<index; i++)
        {
            if(i<index-1)
                s+=a[i]+", ";
            else
                s+=a[i];
        }
        return s;
    }
// Grow size of Array
    private   void grow() {
        int[] b =new int[a.length*2];
        for (int i=0; i<index; i++)
        {
            b[i]=a[i];
        }
        a=b;
    }

    // Print Array
//    public void print()
//    {
//        for (int i=0; i<a.length; i++)
//        System.out.print(a[i]+" ");
//    }

}

