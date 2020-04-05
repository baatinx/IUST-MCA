interface  HPPrinter{
   public void print(String text);

}

interface  EpsionPrinter{
   public  void print(String text);
}

interface  MicrosoftPrinter{
    public void print(String text);
    public boolean cortantStatus();

}

 public class Printer implements HPPrinter,EpsionPrinter,MicrosoftPrinter{
    public void print(String text){
        System.out.println("page printed sucessfully : ");
        System.out.println(text);
    }

    public boolean cortantStatus(){
        System.out.println("Cortant Status ok");
        return true;
    }
}