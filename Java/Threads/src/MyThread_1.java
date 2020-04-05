import  java.lang.Thread;
//public class MyThread_1 {                 // normal implementation
public class MyThread_1 extends  Thread{    // thread implementation

    // specify task 1, suppose print 5 time "hi"

    // run() will automatically execute when we will start thread
    public  void run(){

        for (int i = 0; i <10; i++) {
            System.out.println("Hi - task 1 from thread 1");
            // sleep the thread for 1 second after execution
             try{
                 Thread.sleep(1000);
             } catch (Exception e){

             }
        }
    }
}
