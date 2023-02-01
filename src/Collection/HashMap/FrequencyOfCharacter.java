package Collection.HashMap;

import java.util.*;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String s = "abcdabcaba";
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int value = map.get(s.charAt(i));
                value++;
                map.put(s.charAt(i), value);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        int max = 0;
        char ch = ' ';
        for (char key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                ch = key;
            }

        }


    }
}
