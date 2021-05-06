import java.util.ArrayList;

public class Stock implements Cloneable {
    private static double stockBudget;
    public static ArrayList<StoreProduct> stockProductList = new ArrayList<StoreProduct>(0);

    //Constructors
    public Stock(double stockBudget){
        Stock.stockBudget = stockBudget;
    }
    //Accessors
    //public double getStockBudget(){
    //    return stockBudget;
    //}
    //public ArrayList<StoreProduct> getStockProductList(){
    //    return this.stockProductList;
    //}

    //Mutators
    //public void setStockProductList(ArrayList<StoreProduct> stockProductList){
      //  this.stockProductList = stockProductList;
    //}
    public static void setStockBudget(double stockBudget){
        Stock.stockBudget = stockBudget;
    }

    //Methods

    public static void BuyExistingProduct(StoreProduct boughtProduct) throws InvalidStoreProductAction {
        double finalPrice = 0;
        for(StoreProduct inStockProduct : Stock.stockProductList){
            if(boughtProduct.getStoreProduct().getProductName().equals(inStockProduct.getStoreProduct().getProductName())){
                finalPrice += boughtProduct.getStoreProductQuantity()*inStockProduct.getStoreProductBuyPrice();
                inStockProduct.addQuantity(boughtProduct);
                break;
            }
        }
        Stock.removeFromBudget(finalPrice);
    }

    public static void BuyNewProduct(StoreProduct boughtProduct) throws ProductOutOfQuantityException, InvalidStoreProductAction {
        double finalPrice = 0;
        StoreProduct inStockProduct = new StoreProduct(boughtProduct.getStoreProduct(),0,boughtProduct.getStoreProductBuyPrice(),boughtProduct.getStoreProductSellPrice());
        Stock.addStoreProduct(inStockProduct);
        finalPrice += boughtProduct.getStoreProductQuantity()*inStockProduct.getStoreProductBuyPrice();
        inStockProduct.addQuantity(boughtProduct);
        Stock.removeFromBudget(finalPrice);
    }

    //Methods
    public static void addStoreProduct(StoreProduct newStoreProduct){
        stockProductList.add(newStoreProduct);
    }
    public static void removeFromBudget(double budgetRemoval){
        setStockBudget(Stock.stockBudget-budgetRemoval);
    }
    public static void addToBudget(double budgetAddition){
        Stock.setStockBudget((Stock.stockBudget+budgetAddition));
    }
    public String toString(){
        return "Stock Budget" + Stock.stockBudget;
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Stock){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}