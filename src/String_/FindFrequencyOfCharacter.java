package String_;

public class FindFrequencyOfCharacter {
    public static void main(String[] args) {
        String s1="pradip";
        int counter=0;
         char[] ca=s1.toCharArray();
         int count=0;
         for (int i=0; i<ca.length; i++)
         {
              boolean present=false;
             for (int j=0; j<i; j++)
             {
                 if (ca[i]==ca[j])
                     present=true;
             }
             if (!present)
                 count++;
         }
        System.out.println(count);
         char[]  unique=new char[count];
         int index=0;
          for (int i=0; i<ca.length; i++)
          {
              boolean present=false;
              for (int j=0; j<i; j++)
              {
                  if (ca[i]==ca[j])
                      present=true;
              }
              if (!present)
                  unique[index++]=ca[i];
          }
          String s2=new String(unique);
        System.out.println("String :"+s2);

        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i)==s2.charAt(i))
                counter++;
            System.out.println(s2.charAt(i)+" "+counter);
        }

    }
}
