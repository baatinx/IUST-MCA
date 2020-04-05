public class MyThread_1 extends Show implements Runnable{

    public void run() {
      //  put();//  first time in first thread only this  function is called, and hello from second thread is executed
        // then reset processing  is executed after 1 sec. for both

        /*
        // if the allow , programs behaves strange,
        for( long i = 0; i <1000000; i++)
            System.out.println("MyThread_1\2 extends show, so it can't now extend \"Thread\" as well. Now we will implement Thread using Runnbale Interface");
       */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi - Task from  MyThread_1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }
}
