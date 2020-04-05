public class MyThread_2 extends Show implements Runnable{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello - Task from  MyThread_2");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }
}
