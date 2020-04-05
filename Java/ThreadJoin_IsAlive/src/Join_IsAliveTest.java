public class Join_IsAliveTest {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread( () ->{
            for (int i = 0; i < 10; i++) {
                System.out.println("hi - Task from  MyThread_1");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        } );

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello - Task from  MyThread_2");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        // set thread name and priority
        t1.setName("Hi_Thread");
        t2.setName("Hello_Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);


        // start first thread

        t1.start();


        try{
            Thread.sleep(100);
          }catch (Exception e){
        }




        t2.start();

        // below statement will execute after the first thread starts executing
        // because main thread has to wait for 100ms, to start the next/second thread()
        // so main thread will do his remaining work ; i.e to execute other statements

        System.out.println("main thread task ----- -- do something ");



        // check whether first thread is alive or not


        if(t1.isAlive()) System.out.println("Thread_1 is alive"); else System.out.println("Thread_1 is dead");

        t1.join();

        // check whether first thread is alive or not

        if(t1.isAlive()) System.out.println("Thread_1 is alive"); else System.out.println("Thread_1 is dead");

        System.out.println("thread : '"+t1.getName()+"'finishes his work");

        t2.join();

        System.out.println("thread : '"+t2.getName()+"'finishes his work");

        // next statement executes only when both the threads will join back the main thread
        // that mean when both the threads will finish their work and will join back

        System.out.println("do main thread task after both threads finishes their task");
    }

}
