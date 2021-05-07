import java.util.ArrayList;

public final class Store implements Cloneable {
    private static String storeName;
    private static String storeLicenseNumber;
    public static double storeBudget = 1000000;
    public static ArrayList<StoreProduct> productList = new ArrayList<>(0);

    //
    //Constructors
    //
    /**
     * Constructor for creating an object of type Store
     * @param storeName of type String
     * @param storeLicenseNumber of Type String
     * @param storeBudget of type double
     */
    public Store(String storeName, String storeLicenseNumber,double storeBudget){
        Store.storeName = storeName;
        Store.storeLicenseNumber = storeLicenseNumber;
        Store.storeBudget = storeBudget;

    }



    //
    //Methods
    //
    /**
     * Static Function to request given product from stock
     * @param newStoreProduct of type StoreProduct
     * @throws ProductNotFoundInStockException thrown when the product is not present in stock
     * @throws ProductOutOfQuantityException thrown when there is no enough quantity of product in stock
     * @throws InvalidStoreProductAction thrown when invalid action to StoreProduct object is done (i.e.) wrong setter usage
     */
    public static void RequestProductFromStock(StoreProduct newStoreProduct) throws  ProductNotFoundInStockException,ProductOutOfQuantityException, InvalidStoreProductAction {
        boolean foundInStock = false;
        boolean foundInStockQuantity = false;
        StoreProduct inStockProduct = null;
        for(StoreProduct stockProduct : Stock.stockProductList){
            if(newStoreProduct.getStoreProduct().getProductName().equals(stockProduct.getStoreProduct().getProductName())
                    && newStoreProduct.getStoreProduct().getProductType().equals(stockProduct.getStoreProduct().getProductType())
                    && newStoreProduct.getStoreProductBuyPrice() == stockProduct.getStoreProductBuyPrice()
                    && newStoreProduct. getStoreProductSellPrice() == stockProduct.getStoreProductSellPrice()) {
                foundInStock = true;
                inStockProduct = stockProduct;
                if(newStoreProduct.getStoreProductQuantity() <= inStockProduct.getStoreProductQuantity()){
                    foundInStockQuantity = true;
                    break;
                }
            }
        }
        if(!foundInStock) {
            throw new ProductNotFoundInStockException("Product " + newStoreProduct.getStoreProduct().getProductName() + " is not in the stock");
        }
        else if(!foundInStockQuantity){
            throw new ProductOutOfQuantityException("There is no much quantity of product " + newStoreProduct.getStoreProduct().getProductName() + "in stock");
        }
        else {
            boolean foundInStore = false;
            StoreProduct inStoreProduct = null;
            for (StoreProduct currentProduct : Store.productList) {
                if (newStoreProduct.getStoreProduct().getProductName().equals(currentProduct.getStoreProduct().getProductName())
                        && newStoreProduct.getStoreProduct().getProductType().equals(currentProduct.getStoreProduct().getProductType())
                        && newStoreProduct.getStoreProductBuyPrice() == currentProduct.getStoreProductBuyPrice()
                        && newStoreProduct. getStoreProductSellPrice() == currentProduct.getStoreProductSellPrice()) {
                    foundInStore = true;
                    inStoreProduct = currentProduct;
                }
            }
            if (!foundInStore) {
                addProductInStore(newStoreProduct);
                inStockProduct.removeQuantity(newStoreProduct);
            }
            else{
                inStoreProduct.addQuantity(newStoreProduct);
                inStockProduct.removeQuantity(newStoreProduct);
            }
        }
    }


    /**
     * Static Function to Sell a product from Store
     * @param soldProduct of type StoreProduct
     * @throws ProductOutOfQuantityException  thrown when there is no enough quantity of product in stock
     * @throws ProductNotFoundInStoreException  thrown when the product is not present in store
     */
    public static void Sell(StoreProduct soldProduct) throws ProductOutOfQuantityException, ProductNotFoundInStoreException, InvalidStoreProductAction {
        boolean foundInStore = false;
        boolean foundInStoreQuantity = false;
        StoreProduct inStoreProduct = null;
        for(StoreProduct currentProduct : Store.productList){
            if(soldProduct.getStoreProduct().getProductName().equals(currentProduct.getStoreProduct().getProductName())
                    && soldProduct.getStoreProduct().getProductType().equals(currentProduct.getStoreProduct().getProductType())
                    && soldProduct.getStoreProductBuyPrice() == currentProduct.getStoreProductBuyPrice()
                    && soldProduct. getStoreProductSellPrice() == currentProduct.getStoreProductSellPrice()){
                foundInStore = true;
                inStoreProduct = currentProduct;
                if(soldProduct.getStoreProductQuantity() <= currentProduct.getStoreProductQuantity()){
                    foundInStoreQuantity = true;
                    break;
                }
            }
        }
        if(!foundInStore){
           throw new ProductNotFoundInStoreException("Product " + soldProduct.getStoreProduct().getProductName() + " is not in the store");
        }
        else if(!foundInStoreQuantity){
            throw new ProductOutOfQuantityException("There is no much quantity of " + soldProduct.getStoreProduct().getProductName() + " in the store");
        }
        else{
            inStoreProduct.removeQuantity(soldProduct);
            addToBudget(soldProduct.getStoreProductQuantity()*soldProduct.getStoreProductSellPrice());

        }
    }


    /**
     * Static Function to add given StoreProduct to store List
     * @param newProduct of type StoreProduct
     */
    public static void addProductInStore(StoreProduct newProduct){
        Store.productList.add(newProduct);
    }

    /**
     * Static Function for removing money from Store budget
     * @param budgetRemoval of type double
     */
    public static void removeFromBudget(double budgetRemoval){
        Store.storeBudget-=budgetRemoval;
    }

    /**
     * Static Function for adding money to Store budget
     * @param budgetAddition of type double
     */
    public static void addToBudget(double budgetAddition){
        storeBudget+=budgetAddition;
    }
    @Override
    public String toString(){
        return "Store: " + storeName + "\nLicense Number: " + storeLicenseNumber;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        return o instanceof Store;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
