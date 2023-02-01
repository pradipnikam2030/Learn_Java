package Collection.Inbuilt_Methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(11);
        list.add(11);

        /// Inhanced for loop...
        for(int data:list)
            System.out.print(data+" ");
        // for loop
        for(int i=0; i<list.size(); i++)
        System.out.print(list.get(i)+" ");

        // add at specific index...
        list.add(2, 99);
        System.out.println(list);

        //Add all

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list);
        System.out.println("dusri vali list --> "+list2);

      //  ArrayList<Integer> list3 = new ArrayList<Integer>(list);

        // clear method..
       // list.clear();
       // System.out.println(list);

        // get method....
        int ans=list.get(3);
        System.out.println(ans);

        //is Empty
       // System.out.println(list.isEmpty());

//        Iterator<Integer> iterator =list.iterator();
//        while(iterator.hasNext())
//            System.out.println(iterator.next());

           Integer[] a=new Integer[list.size()];
              a=list.toArray(new Integer[0]);

            for(int data : a)
                System.out.println("it is an Array--> "+data+" ");
        List<Integer> merivali=list.subList(1,3);
        System.out.println(merivali);

    }
}
