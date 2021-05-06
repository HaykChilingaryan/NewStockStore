public class InvalidStoreProductAction extends Exception{
    public InvalidStoreProductAction(){
        super(
                "Invalid Action to Store product");
    }
    public InvalidStoreProductAction(String message){
        super(message);
    }
}
