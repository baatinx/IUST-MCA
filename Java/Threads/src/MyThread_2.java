import java.lang.Thread;

//public class MyThread_2{                  // normal implementation
public class MyThread_2 extends Thread {   // thread implementation

    // specify task 1, suppose print 5 time "hello"

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello - task 2 from thread 2");
            // sleep the thread for 1 second after execution

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
