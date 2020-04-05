import java.util.Vector;

public class VectorTest {
    // Vector is same as ArrayList
    // both Vector & ArrayList implements List interface
    // likewise ArrayList Vector also Stores Objects, also we can't add, remove in the middle

    // Vector is Dynamic Array
    // All the method of Vectors are ThreadSafe. e.g --public void Synchronised func()
    // by default the initial capacity of vectors is 10
    // by default the initial capacity of ArrayList is 0
    // memory double every time, when we fall of shortage of space , ie, 10,20,40,80
    //because of Synchronised methods, vectors are slow than ArrayList

    //we should always prefer ArrayList over Vector

    //when to use vector

    public static void main(String[] args) {
        Vector vct = new Vector();
        //Vector<Integer> vct = new Vector<>(); -- generic Vector
        System.out.println("By Default initial capacity of Vector is : " + vct.capacity());
        System.out.println("initial size of Vector is : " + vct.size());

        vct.add(1);
        vct.add("two");
        vct.add(3);
        vct.add(4);
        vct.add(5);
        vct.add(6);
        vct.add("seven");
        vct.add(8);
        vct.add(9);
        vct.add(10);

        for (Object v : vct) {
            System.out.println(v);
        }

        System.out.println("capacity of Vector is : " + vct.capacity());
        System.out.println("size of Vector is : " + vct.size());

        // after Adding 10 elements , the capacity of vector is full
        // if we will try to insert another element the capacity will increase by double , ie 20
        // after adding another element the size of the vector will be 11

        vct.add(11);

        // print the 11th element or we can say print element at index 10

        System.out.println(vct.get(10));

        // capacitys will be 20
        // size will be 11
        System.out.println("capacity of Vector is : " + vct.capacity());
        System.out.println("size of Vector is : " + vct.size());

    }




}
