public class ProductOutOfQuantityException extends Exception {
    public ProductOutOfQuantityException(){

        super("Product out of Quantity");
    }
    public ProductOutOfQuantityException(String message){

        super(message);
    }
}
