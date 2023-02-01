import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class MyClass {
    public static void main(String[] args) {
//basic61
        double principal = 5000;
        double time = 4;
        double rate = 14.25;
        double interest = principal * time * rate / 100.0;
//int cast inti int
        System.out.println((int)interest);
    }
}


