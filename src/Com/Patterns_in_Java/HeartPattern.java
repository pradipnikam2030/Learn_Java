package Com.Patterns_in_Java;

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class HeartPattern {
    public static void main(String[] args) {
        for (int i=0; i<18; i++)
        {
            for (int j=0; j<22; j++)
            {
                if ((i<4&&j+i==3)||(j-i==5 && i<4)||(i<4&&j+i==11)||(j-i==16 ))
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
