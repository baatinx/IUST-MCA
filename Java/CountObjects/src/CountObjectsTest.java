public class CountObjectsTest {
    static {
        System.out.println("main() - i will be executed first because iam static block");
    }
    public static void main(String[] args) {
        CountObjects obj1= new CountObjects();
        CountObjects obj2= new CountObjects();
        CountObjects obj3= new CountObjects();
        CountObjects obj4= new CountObjects();
        CountObjects obj5= new CountObjects();
        CountObjects obj6= new CountObjects();
        obj1.counter();
    }
    static {
        System.out.println("i will be executed after first static and before main()s because iam static block");
    }
}
