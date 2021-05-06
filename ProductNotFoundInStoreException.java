public class ProductNotFoundInStoreException extends Exception {
    public ProductNotFoundInStoreException(){
        super(
                "No Product in Store");
    }
    public ProductNotFoundInStoreException(String message){
        super(message);
    }
}
