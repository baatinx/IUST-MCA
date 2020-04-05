public class child {


    public int  showData(){
        int data = 100;
        System.out.println("Data : " + data);
    return 0;
    }
    @Override
    public void showData(){
        int data = 10000000;
        System.out.println("Data : " + data);
    }
}
