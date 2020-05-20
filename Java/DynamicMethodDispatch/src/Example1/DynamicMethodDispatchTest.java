package Example1;

public class DynamicMethodDispatchTest {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        B b = new B();
        b.show();

        System.out.println();

        A obj1 = new B();
        obj1.show();

        A obj2 = new B();
        System.out.println(obj2);

        //By using above reference we can call only overridden methods
        // sum is not an overridden method, thus obj1.sum() will generate error

        //what is basically typeCasting  ??

        //obj2.sum();


        ((B) obj1).sum();
        System.out.println(obj2);
        //obj2.sum();
        B o = ((B)obj2);
        System.out.println(o);
    }
}
