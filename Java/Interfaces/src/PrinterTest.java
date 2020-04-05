import java.util.Scanner;
class PrinterTests{
    public static void main(String[] args) {
        Printer obj = new Printer();
        if((obj.cortantStatus())==true) {
            System.out.println("Enter the text that you want to print");
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            obj.print(text);
        }else{
            System.out.println("Cortana Status failed, Operation aborted");

        }
    }
}
