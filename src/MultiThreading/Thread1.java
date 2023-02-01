package MultiThreading;

public class Thread1 extends  Thread {
    public void run()
    {
        for (int i=0; i<10; i++) {
            System.out.println("Pradip");

            try {
                Thread.sleep(600);
            } catch (Exception e) {
            }
        }
    }
    }

