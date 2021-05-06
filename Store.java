import java.util.ArrayList;

public final class Store implements Cloneable {
    private static String storeName;
    private static String storeLicenseNumber;
    private static Stock storeStock;
    private static double storeBudget;
    public static ArrayList<StoreProduct> productList = new ArrayList<StoreProduct>(0);


    public Store(String storeName, String storeLicenseNumber,Stock storeStock,double storeBudget){
        Store.storeName = storeName;
        Store.storeLicenseNumber = storeLicenseNumber;
        this.storeStock = storeStock;
        Store.storeBudget = storeBudget;

    }

    //Accessors
    public Stock getStoreStock(){
        return this.storeStock;
    }


    //Mutators
    public static void setStoreBudget(double storeBudget){
        Store.storeBudget = storeBudget;
    }

    //Methods
    public static void addProductInStore(StoreProduct newProduct){
        productList.add(new StoreProduct(newProduct.getStoreProduct(),0, newProduct.getStoreProductBuyPrice(), newProduct.getStoreProductSellPrice()));
    }


    public static void RequestProductFromStock(StoreProduct newStoreProduct) throws  ProductOutOfQuantityException, InvalidStoreProductAction {
        boolean foundInStock = false;
        boolean foundInStockQuantity = false;
        StoreProduct inStockProduct = null;
        for(StoreProduct stockProduct : Stock.stockProductList){
            if(newStoreProduct.getStoreProduct().equals(stockProduct.getStoreProduct())
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
            Stock.BuyNewProduct(newStoreProduct);
            RequestProductFromStock(newStoreProduct);
        }
        else if(!foundInStockQuantity){
            Stock.BuyExistingProduct(newStoreProduct);
            RequestProductFromStock(newStoreProduct);
        }
        else {
            boolean foundInStore = false;
            StoreProduct inStoreProduct = null;
            for (StoreProduct currentProduct : Store.productList) {
                if (newStoreProduct.getStoreProduct().equals(currentProduct.getStoreProduct())
                        && newStoreProduct.getStoreProductBuyPrice() == currentProduct.getStoreProductBuyPrice()
                        && newStoreProduct. getStoreProductSellPrice() == currentProduct.getStoreProductSellPrice()) {
                    foundInStore = true;
                    inStoreProduct = currentProduct;
                }
            }
            if (!foundInStore) {
                addProductInStore(newStoreProduct);
                RequestProductFromStock(newStoreProduct);
            }
            else{
                inStoreProduct.addQuantity(newStoreProduct);
                inStockProduct.removeQuantity(newStoreProduct);
            }
        }
    }

    public static void RequestProductFromStock(ArrayList<StoreProduct> newStoreProducts) throws ProductOutOfCapacityException, ProductOutOfQuantityException, InvalidStoreProductAction {
        for (StoreProduct stockProduct:newStoreProducts) {
            RequestProductFromStock(stockProduct);
        }
    }

    public static void Sell(StoreProduct soldProduct) throws ProductOutOfQuantityException, InvalidStoreProductAction {
        boolean foundInStore = false;
        boolean foundInStoreQuantity = false;
        StoreProduct inStoreProduct = null;
        for(StoreProduct currentProduct : Store.productList){
            if(soldProduct.getStoreProduct().equals(currentProduct.getStoreProduct())
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
            RequestProductFromStock(soldProduct);
            Sell(soldProduct);
        }
        else if(!foundInStoreQuantity){
            throw new ProductOutOfQuantityException("There is no much quantity of " + soldProduct.getStoreProduct().getProductName() + " in the store");
        }
        else{
            inStoreProduct.removeQuantity(soldProduct);
            addToBudget(soldProduct.getStoreProductQuantity()*soldProduct.getStoreProductSellPrice());
            RequestProductFromStock(soldProduct);
        }
    }

    public static void Sell(ArrayList<StoreProduct> soldProducts) throws ProductOutOfQuantityException, ProductOutOfCapacityException, InvalidStoreProductAction {
        for(StoreProduct soldProduct : soldProducts){
            Sell(soldProduct);
        }
    }

    public static void removeFromBudget(double budgetRemoval){
        setStoreBudget(storeBudget-budgetRemoval);
    }
    public static void addToBudget(double budgetAddition){
        setStoreBudget((storeBudget+budgetAddition));
    }
    public String toString(){
        return "Store: " + storeName + "\nLicense Number: " + storeLicenseNumber;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Store){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
