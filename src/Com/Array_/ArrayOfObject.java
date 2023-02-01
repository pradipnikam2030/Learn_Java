package Com.Array_;

public class ArrayOfObject {
    public static void main(String[] args) {
        Student s1=new Student(1, "Somu", 45);
        Student s2=new Student(2, "Gomu", 65);
        Student s3=new Student(3, "Lomu", 70);
        Student s4=new Student(4, "Domu", 39);
        Student[] s={s1,s2,s3,s4};

        for (int i=0; i<s.length; i++)
        {
            System.out.println(s[i].roll+" "+s[i].name+" "+s[i].marks);
        }
    }
}
