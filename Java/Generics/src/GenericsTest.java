public class GenericsTest {

    public static void main(String[] args) {
        Generics<Integer> obj1 = new Generics<Integer>();
        obj1.setFirst(1);
        obj1.setSecond(2);
        System.out.println("Object 1");
        System.out.println("first : "+obj1.getFirst()+" second : "+obj1.getSecond());



        Generics<String> obj2 = new Generics<String>();
        obj2.setFirst("Basit");
        obj2.setSecond("numan");
        System.out.println("Object 2");
        System.out.println("first : "+obj2.getFirst()+" second : "+obj2.getSecond());

    }

}
