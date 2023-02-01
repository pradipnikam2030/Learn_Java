package Collection.HashMap;

public class HasMap {
    public static void main( String[] args )
    {
        Node node=new Node();
        System.out.println(node.hashCode());

        String s = "abc";
        System.out.println(s.hashCode());

        Kalidas kalidas = new Kalidas();
        kalidas.add(10);
        kalidas.add(35);
        kalidas.add(46);
        kalidas.add(69);
        kalidas.add(17);
        kalidas.add(51);
        kalidas.add(11);
        kalidas.add(54);

        System.out.println(kalidas.contains(25));
    }
}
class Kalidas
{
    Node[] a = new Node[5];

    public boolean contains(int data)
    {
        int index=data%a.length;
        Node temp= a[index];
        while (temp!=null)
        {
            if(temp.data==data)
                return true;
            temp=temp.next;
        }
        return false;
    }
    public void print()
    {
        for (int i = 0; i < a.length; i++)
        {
            Node temp=a[i];
            while (temp != null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public void add(int data)
    {
        Node node= new Node();
        node.data=data;

        int index = data%a.length;
        if(a[index]==null)
        {
            a[index]=node;
        }
        else
        {
            Node temp=a[index];
            while (temp.next!=null)
                temp=temp.next;
            temp.next=node;
        }
    }
}


class Node
{
    int data;
    Node next;
}
