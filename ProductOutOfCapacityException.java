public class ProductOutOfCapacityException extends Exception {
    public ProductOutOfCapacityException(){
        super("Product out of Capacity");
    }

    public ProductOutOfCapacityException(String message){
        super(message);
    }
}