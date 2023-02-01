package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WayToIterate {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Yellow");
        list.add("Black");
        list.add("Violet");
        list.add("Purple");
        System.out.println(list.get(list.size()-1));
        // For Loop
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+" ");
        System.out.println();
        // While Loop
         int i=0;
         while (i<list.size())
         {
             System.out.print(list.get(i)+" ");
             i++;
         }
        System.out.println();
         // Enhance / Advanced for Loop
        for(String data:list)
            System.out.print(data+" ");
        System.out.println();

        // Using Iterator
        Iterator<String> it=list.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");

        System.out.println();
        // Methods.....
        list.add(0,"White");
        list.remove(0);
        list.set(1,"Reddish");
       // Collections.shuffle(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.clone());
        System.out.println(list.get(2));

       List<String> sublist=list.subList(2,5);
        System.out.println(sublist);

        System.out.println(list.equals(sublist));
         list.addAll(sublist);
        System.out.println(list);

    }
}
