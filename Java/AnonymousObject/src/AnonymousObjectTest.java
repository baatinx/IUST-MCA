public class AnonymousObjectTest {
    public static void main( String[] args ){
        // Anonymous Object are objects without reference variables

        // i is primitive variable of type int
        int i = 5;

        //"A obj "          obj is a reference variable in Stack of type A
        //" = new A()"      this will create an object of type A in heap memory with the help of Constructor A(), and will return the address of it

        // obj just store the reference of object created in heap
        // via this method the object in heap is not eligible for garbage collection, it will be in heap till program termination
        A obj = new A();

        // set x = 5, and display the value
        obj.x = 4;
        obj.show();

        // if we have to use an object just once, anonymous object are preferred, once its work is done it will be automatically eligible for garbage collection
        // no reference variable is created in stack for Anonymous objects
        // better memory management

        // by default class variables are initialized with 0

        // this will create a new object in heap, and will set X = 5
        new A().x = 5;

        //below line will create another object in heap, and will print 0, by default variables are initialised with 0
        new A().show();

        // below line will create another new object of type b in heap memory

        // this time construct will set x = 4, and then show() will be called
        new B( 4 ).show();
    }

}
