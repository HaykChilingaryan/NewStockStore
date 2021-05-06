import java.util.ArrayList;

public class Stock implements Cloneable {
    private static double stockBudget;
    public static ArrayList<StoreProduct> stockProductList = new ArrayList<StoreProduct>(){
        {
            add(new StoreProduct(Product.productList.get(0),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(1),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(2),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(3),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(4),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(5),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(6),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(7),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(8),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(9),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(10),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(11),10,10.0,8.0));
            add(new StoreProduct(Product.productList.get(11),10,10.0,8.0));
        }
    };

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
            if(boughtProduct.getStoreProduct().equals(inStockProduct.getStoreProduct())){
                finalPrice += boughtProduct.getStoreProductQuantity()*boughtProduct.getStoreProductBuyPrice();
                inStockProduct.addQuantity(boughtProduct);
                break;
            }
        }
        Stock.removeFromBudget(finalPrice);
    }

    public static void BuyNewProduct(StoreProduct boughtProduct) throws ProductOutOfQuantityException, InvalidStoreProductAction {
        double finalPrice = 0;
        StoreProduct inStockProduct = new StoreProduct(boughtProduct.getStoreProduct(),0,boughtProduct.getStoreProductBuyPrice(),boughtProduct.getStoreProductSellPrice());
        Stock.addProductInStock(inStockProduct);
        finalPrice += boughtProduct.getStoreProductQuantity()*inStockProduct.getStoreProductBuyPrice();
        inStockProduct.addQuantity(boughtProduct);
        Stock.removeFromBudget(finalPrice);
    }

    //Methods
    public static void addProductInStock(StoreProduct newStoreProduct){
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