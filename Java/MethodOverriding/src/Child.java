public class  Child extends Parent{
    // show() scope get overwritten

    public void show(){
        System.out.println("hello from Child ");
        super.show(); // bring the scope of super class function
    }
}
