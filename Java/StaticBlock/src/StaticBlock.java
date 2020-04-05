public class StaticBlock{
    // static blocks are executed first after the class[staticBlock] is loaded in jvm
    //after static block rest of the methods like main() are executed
    static {
        System.out.println("First Static Block : Hello from first Static block");
    }
    public static void main(String[] args) {
        System.out.println("Hello from main()");
    }

    static {
        System.out.println("Second Static Block : Hello from Second Static block");
    }
}
