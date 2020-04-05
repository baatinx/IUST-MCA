// set a global constant for MyThread_1 and MyThread_2 delay
//public static const int  THREAD_Delay = 1000;
public class MyThreadsTest {
    public static void main(String[] args){
        MyThread_1 obj1 = new MyThread_1();
        MyThread_2 obj2 = new MyThread_2();

        // normal implementation of the program be like
        //  obj1.run();
        // obj2.run();


        // below will show the threads implementation

        // program will execute both the threads on two cores, parallel

        obj1.start();
        //set delay between two threads so that the second thread will execute after first thread  always
        try{
            Thread.sleep(100); // sleep only first time
            // we have to delay the second thread for just a moment (e.g. 100ms) so that thread first will be always in front line
            // only first time thread second will sleep for some time
            // to understand it better allow below thread

            // only for the first time thread  second will execute after 3 seconds
            // after that both will be executed after
            //Thread.sleep(3000);

        }catch (Exception e){

        }

        obj2.start();

    }
}
