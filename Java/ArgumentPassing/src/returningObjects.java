public class returningObjects {
    private String ownerName, propertyLocation;

    returningObjects(String ownerName, String propertyLocation){
        this.ownerName = ownerName;
        this.propertyLocation = propertyLocation;

    }

    public void getDetails(){
        System.out.println("Owner name : " + ownerName + ", Property Location : " + propertyLocation);
    }

    public returningObjects purchaseAnotherProperty( String newPropertylocation ){
        // return a new object from this method
        // all values will be same except propertyLocation

        returningObjects newproperty = new returningObjects(this.ownerName, newPropertylocation);

        // return new object

        return newproperty;
    }

}