public class ThreadsTest {
    public static void main(String[] args) {

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
        t1.start();
        try{
            Thread.sleep(100);
        }catch (Exception e){

        }

        t2.start();

    }
}