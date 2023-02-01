package Collection.LinkList;

public class MainClass {
    public static void main(String[] args) {
        MyLinkList list=new MyLinkList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
     // list.set(3,100);
        System.out.println("size of the list - "+list.size());
        System.out.println("last time occur - "+list.lastIndexOf(40));
        System.out.println("khali hai ya nahi - "+list.isEmpty());
        System.out.println("index wala data- "+list.get(3));
        System.out.println("data wali index- "+list.indexOf(30));
        System.out.println("mila ya nahi- "+list.contains(30));
        list.print();

    }
}

class MyLinkList{
    Node root;
    public void add(int data)
    {
        Node obj=new Node(data);
        if(root==null)
            root=obj;
        else {
            Node temproot=root;
            while (temproot.next!=null)
            {
                temproot=temproot.next;
            }
            temproot.next=obj;
        }
    }
    public void print()
    {
        Node temproot=root;
        while(temproot!=null)
        {
            System.out.print(temproot.data+" ");
            temproot=temproot.next;
        }
    }
    // contain method...
     public boolean contains(int data)
     {
         Node temproot=root;
         while(temproot!=null)
         {
             if(temproot.data==data)
                 return true;
             temproot=temproot.next;
         }
         return false;
     }

     // index of method...
    public int indexOf(int userData)
    {
        Node temproot=root;
        int index=0;
        while (temproot!=null)
        {
             if (temproot.data==userData)
                 return index;
            index++;
            temproot=temproot.next;
        }
        return -1;
    }
    // get method
    public int get(int userIndex)
    {
        if(userIndex<0)
            throw new ArrayIndexOutOfBoundsException();
        Node temproot=root;
        int index=0;
        while (temproot!=null)
        {
            if (index==userIndex)
                return temproot.data;
            index++;
            temproot=temproot.next;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    // isEmpty method
    public boolean isEmpty()
    {
        if(root==null)
            return true;
        return false;
    }
    // set method
 public void set(int userIndex, int userData)
 {
     if (userIndex<0)
         throw new ArrayIndexOutOfBoundsException();
     Node temproot=root;
     int index=0;

     while(temproot!=null)
     {
         if(index==userIndex) {
             temproot.data = userData;
           return;
         }
         index++;
         temproot=temproot.next;
     }
    throw new ArrayIndexOutOfBoundsException();
 }
 // size method
    public int size(){
        Node temproot=root;
        int index=0;
        while (temproot!=null)
        {
            index++;
            temproot=temproot.next;
        }
        return index;
    }

    // last index of method
    public int lastIndexOf(int userData)
    {
        Node temproot=root;
        int index=0;
        int lastIndex=-1;
        while (temproot!=null)
        {
             if (userData== temproot.data)
                 lastIndex=index;
                 index++;
                 temproot=temproot.next;
        }
        return lastIndex;
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}