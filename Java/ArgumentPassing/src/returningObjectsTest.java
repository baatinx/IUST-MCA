public class returningObjectsTest {
    public static void main(String[] args) {
        // create a simple object
        returningObjects owner = new returningObjects("DANISH WANI", "NATIPORA - GULSHAN COLONY");

        String newPropertyLocation = "CHANAPORA - SAFRON COLONY";

        returningObjects ownersNewProperty;

        ownersNewProperty = owner.purchaseAnotherProperty(newPropertyLocation);


        owner.getDetails();
        ownersNewProperty.getDetails();






    }
}
