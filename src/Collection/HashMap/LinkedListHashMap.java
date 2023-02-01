package Collection.HashMap;

public class LinkedListHashMap {
    public static void main(String[] args) {
         HashMapImplementation hashmap= new HashMapImplementation();
         hashmap.add(12,"pune");
         hashmap.add(14, "pcms");
         hashmap.add(18, "nashik");
        System.out.println(hashmap.get(2));
         hashmap.print();


    }
}

class HashMapImplementation{
   private Nodee[] a=new Nodee[5];
   private Nodee root;
   public void print()
   {
       Nodee temp=root;
       while (temp!=null)
       {
           System.out.println(temp.key+" "+temp.value);
           temp=temp.linkedListNext;
       }
   }
    public String get(int key)
    {
        int index=key%a.length;
        Nodee temp=a[index];
        while(temp!=null)
        {
            if(temp.key==key)
                return temp.value;
            temp=temp.hashTableNext;
        }
        return null;
    }
   public void add(int key, String value)
   {
       Nodee node = new Nodee();
       node.key = key;
       node.value = value;
       // Add in Hashtable...
       int index=key%a.length;
       if(a[index]==null)
           a[index]=node;
       else
       {
           Nodee temp=a[index];
           while (temp.hashTableNext!=null)
           {
               temp=temp.hashTableNext;
           }
           temp.hashTableNext=node;
       }
       // add in lInked list
       if(root==null)
           root=node;
       else {
           Nodee temp=root;
           while (temp.linkedListNext!=null)
           {
               temp=temp.linkedListNext;
           }
           temp.linkedListNext=node;
       }
   }

}


class Nodee{
    int key;
    String value;
    Nodee hashTableNext;
    Nodee linkedListNext;
}