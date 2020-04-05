public class MyThreadsTest{
    public static void main(String[] args) {

        // See first Threads Programs

        MyThread_1 obj1 = new MyThread_1();
        MyThread_2 obj2 = new MyThread_2();

        // we cant now use start() method to start thread.
        //obj1.start();         // will generate error because Runnable has only one method, run(), so how to start the thread?;
        //obj2.start();         // error

        // to start threads[ obj1 and obj2] Create object of "Thread" and  pass MyThread objects

        Thread t1 = new Thread(obj1);  // basically we are linking t1.start() with obj1.run();

        Thread t2 = new Thread(obj2);  // same here

        t1.start();
        try{
            Thread.sleep(100); // just delay a little bit  thread 2 in the beginning
        }catch (Exception e){

        }

        t2.start();
    }
}
