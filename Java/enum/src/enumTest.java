import java.util.Scanner;

public class enumTest {
    public static void main(String[] args) {

        String input;
        System.out.println("Enter a Size : (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");

        Scanner sc = new Scanner(System.in);;
        input = sc.next().toUpperCase();

        Size size = Enum.valueOf(Size.class,input);

        System.out.println("size =  " + size);

        System.out.println("abbreviation = "+ size.getAbberviation());

        if (size == Size.EXTRA_LARGE)
            System.out.println("good job, -- you paid the attention to the size");
    }
}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private  String abberviation;

    //constructor
    private Size( String abbreviation){
        this.abberviation = abbreviation;
    }

    public String getAbberviation(){
        return abberviation;
    }

}