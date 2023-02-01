package Collection.LinkList;
import java.util.*;
public class Linklist {
    public static void main(String[] args)
    {
         ArrayList<Integer> list=new ArrayList<>();
         list.add(20);
        MyLinkedList<Integer> ll=new MyLinkedList<>();
        ll.myAdd(10);
        ll.myAdd(20);
        ll.myAdd(30);
        ll.myAdd(40);
        ll.myAdd(50);
        ll.addAt(2,100);
       // ll.remove(4);
        System.out.println(ll);
    }
//EndOfMainMethod
}
class Nodee<T>
{
    int data;
    Nodee next;
    Nodee(int data)
    {
        this.data=data;
    }
}
class MyLinkedList<T>
{
    Nodee root;
    public void myAdd(int data)
    {
        Nodee obj=new Nodee(data);

        if(root==null)
            root=obj;
        else
        {
            Nodee temproot=root;
            while(temproot.next!=null)
            {
                temproot=temproot.next;
            }
            temproot.next=obj;
        }
    }
    // remove method
    public void remove(int userIndex)
    {
        if(userIndex<0)
            throw new IndexOutOfBoundsException();
        if(userIndex==0)
        {
            root=root.next;
            return;
        }
        Nodee temproot=root;
        int index=0;
        while(temproot.next!=null)
        {
            if(index==userIndex-1)
            {
                temproot.next=temproot.next.next;
                return;
            }
            index++;
            temproot=temproot.next;
        }
        throw new IndexOutOfBoundsException();
    }
    /// Addat
    public void addAt(int userIndex, int data)
    {
        Nodee obj=new Nodee(data);
        if(userIndex==0)
        {
            obj.next=root;
            root=obj;
            return;
        }
        Nodee temproot=root;
        int index=0;
        while (temproot!=null)
        {
            if (index!=userIndex-1)
            {
                obj.next=temproot.next;
                temproot.next=obj;
                return;
            }
            index++;
            temproot=temproot.next;
        }
    }
    /// set method
    public void set(int index,int data)
    {
        Nodee temproot=root;
        int index1=0;
        while(temproot!=null)
        {
            if(index==index1)
                temproot.data=data;
            index1++;
            temproot=temproot.next;
        }
    }
    public String toString()
    {
        String s="[";
        Nodee temproot=root;
        while(temproot!=null)
        {
            if(temproot.next==null)
                s+=temproot.data+"]";
            else
                s+=temproot.data+", ";
            temproot=temproot.next;
        }
        return s;
    }
}
