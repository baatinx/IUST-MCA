public class callByReference {
    private int a, b;

    public void setA( int a ){
        this.a = a;
    }
    public void setB( int b ){
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }

    public void modifyViaCallByValue( int a, int b){
        a *= 15;
        b *= 15;
    }

    public void modifyViaCallByReference( callByReference obj ){
        obj.a *= 15;
        obj.b *= 15;
    }
}
