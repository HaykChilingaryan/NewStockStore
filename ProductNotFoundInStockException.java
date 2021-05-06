public class ProductNotFoundInStockException extends Exception {
    public ProductNotFoundInStockException(){
        super(
                "No Product in Stock");
    }
    public ProductNotFoundInStockException(String message){
        super(message);
    }
}
