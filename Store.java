import java.util.ArrayList;

public final class Store implements Cloneable {
    private static String storeName;
    private static String storeLicenseNumber;
    private static double storeBudget;
    public static ArrayList<StoreProduct> productList = new ArrayList<>(0);


    public Store(String storeName, String storeLicenseNumber,double storeBudget){
        Store.storeName = storeName;
        Store.storeLicenseNumber = storeLicenseNumber;
        Store.storeBudget = storeBudget;

    }




    //Mutators
    public static void setStoreBudget(double storeBudget){
        Store.storeBudget = storeBudget;
    }

    //Methods
    public static void addProductInStore(StoreProduct newProduct){
        productList.add(new StoreProduct(newProduct.getStoreProduct(),0, newProduct.getStoreProductBuyPrice(), newProduct.getStoreProductSellPrice()));
    }


    public static void RequestProductFromStock(StoreProduct newStoreProduct) throws  ProductNotFoundInStockException,ProductNotFoundInStoreException,ProductOutOfQuantityException, InvalidStoreProductAction {
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
            throw new ProductNotFoundInStockException("Product " + newStoreProduct.getStoreProduct().getProductName() + " is not in the stock");
        }
        else if(!foundInStockQuantity){
            throw new ProductOutOfQuantityException("There is no much quantity of product " + newStoreProduct.getStoreProduct().getProductName() + "in stock");
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
                throw new ProductNotFoundInStoreException("Product " + newStoreProduct.getStoreProduct().getProductName() + " is not in the store");

            }
            else{
                inStoreProduct.addQuantity(newStoreProduct);
                inStockProduct.removeQuantity(newStoreProduct);
            }
        }
    }



    public static void Sell(StoreProduct soldProduct) throws ProductOutOfQuantityException, InvalidStoreProductAction, ProductNotFoundInStoreException, ProductNotFoundInStockException {
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
        return o instanceof Store;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
