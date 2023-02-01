package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

          set.add(11);
          set.add(90);
          set.add(33);
          set.add(40);
       set.clear();
        System.out.println(set);
    }
}
