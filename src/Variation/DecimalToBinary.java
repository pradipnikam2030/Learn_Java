package Variation;

import java.sql.SQLOutput;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Deciaml to Binary
        int num=78;
        String num2="";
        while(num>0)
        {
            num2=num%2+num2;
            num=num/2;
        }
        System.out.println(num2);
        // Binary to Decimal
        int num3=0;
        for (int i=0; i<num2.length(); i++)
        {
            int digit=0;
            if (num2.charAt(i)=='1')
                digit=1;
            num3=num3*2+digit;
        }
        System.out.println(num3);
    }
}
