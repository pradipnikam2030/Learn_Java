package MultiThreading;
public class DemoClass2 {
    public static void main(String[] args) {
        Thread4 t1=new Thread4();
       // t1.start();
        Thread4 ojb=new Thread4();
        Thread t2=new Thread(ojb);
        t2.start();
    }
}
class Thread3 extends Thread{
    public void run()
    {
        for (int i=0; i<10; i++)
        {
            System.out.println("hey");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
        }
    }
}
class Thread4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("boy");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
