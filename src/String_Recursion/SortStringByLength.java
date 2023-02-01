package String_Recursion;
// Sort String By Length
public class SortStringByLength {
    public static void main(String[] args) {
        String s1 = "welcome to hef";
        String[] sa = s1.split(" ");
        iLoop(sa, 0);
    }
        private static void iLoop (String[]sa,int i)
        {
            if (i < sa.length) {
                jLoop(sa, i, i + 1);
                System.out.print(sa[i] + " ");
                iLoop(sa, ++i);
            }
        }
        private static void jLoop (String[]sa,int i, int j)
        {
            if (j < sa.length) {
                if (sa[i].length() > sa[j].length()) {
                    String temp = sa[i];
                    sa[i] = sa[j];
                    sa[j] = temp;
                }
                jLoop(sa, i, ++j);
            }
        }
    }

    // OutPut
//to hef welcome
