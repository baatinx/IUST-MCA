package Example2;

import Example1.A;
import Example1.B;
import Example1.C;

public class DynamicMethodDispatchTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A ref;

        ref = a;
        ref.show();

        ref = b;
        ref.show();

        ref = c;
        ref.show();


    }
}
