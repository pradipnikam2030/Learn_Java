package MultiThreading;

public class Thread6 {
    public static void main(String[] args) {

  Thread7 t7=new  Thread7();
    t7.start();
    my t9=new my();
  Thread t=new Thread(t9);
  t.start();
    }
}
class  Thread7 extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++)
            System.out.println("hello");
    }
}
class my implements Runnable
        {

            @Override
            public void run() {
                for (int i=0; i<10000;i++)
                {
                    Thread.yield();
                    System.out.println("hiii");
                }
            }
        }