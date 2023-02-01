package Com.Core_Java;

public class CapitalOrSmall {
    public static void main(String[] args) {
        char ch='a';
          if(ch>='a' && ch<='z')
              System.out.println("Small");
          else if(ch>='A' && ch<='Z') {
              System.out.println("Capital");
          } else
//              throw new IllegalAccessException("Unexpected Value ");
              System.out.println("");
    }
}
