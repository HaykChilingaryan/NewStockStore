import java.util.ArrayList;

public class Stock implements Cloneable {
    public static double stockBudget = 1000000;
    public static ArrayList<StoreProduct> stockProductList = new ArrayList<StoreProduct>(){
        {
            add(new StoreProduct(Product.productList.get(0),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(1),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(2),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(3),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(4),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(5),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(6),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(7),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(8),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(9),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(10),10,7.0,8.0));
            add(new StoreProduct(Product.productList.get(11),10,7.0,8.0));
        }
    };

    //
    //Constructors
    //
    /**
     * Constructor for creating an object of type Stock
     * @param stockBudget of type double
     */
    public Stock(double stockBudget){
        Stock.stockBudget = stockBudget;
    }

    /**
     * Function that Buys given product for stock, checks if product exists or not and acts respectively
     * @param boughtProduct of type StoreProduct
     * @throws InvalidStoreProductAction thrown if invalid action to StoreProduct is done
     */
    public static void Buy(StoreProduct boughtProduct) throws InvalidStoreProductAction{
        boolean foundInStock = false;
        StoreProduct inStockProduct = null;
        double finalPrice = 0;
        for(StoreProduct stockProduct : Stock.stockProductList){
            if(boughtProduct.getStoreProduct().getProductName().equals(stockProduct.getStoreProduct().getProductName())
                    && boughtProduct.getStoreProduct().getProductType().equals(stockProduct.getStoreProduct().getProductType())
                    && boughtProduct.getStoreProductBuyPrice() == stockProduct.getStoreProductBuyPrice()
                    && boughtProduct. getStoreProductSellPrice() == stockProduct.getStoreProductSellPrice()){
                foundInStock = true;
                inStockProduct = stockProduct;
            }
        }
        if(foundInStock){
            inStockProduct.addQuantity(boughtProduct);
            finalPrice += boughtProduct.getStoreProductQuantity()*boughtProduct.getStoreProductBuyPrice();
            Stock.removeFromBudget(finalPrice);
        }
        else{
            Stock.addProductInStock(boughtProduct);
            finalPrice = boughtProduct.getStoreProductQuantity()*boughtProduct.getStoreProductBuyPrice();
            Stock.removeFromBudget(finalPrice);
        }


    }

    //
    //Methods
    //
    /**
     * Function for adding product to store Product list
     * @param newStoreProduct of type StoreProduct
     */
    public static void addProductInStock(StoreProduct newStoreProduct){
        stockProductList.add(newStoreProduct);
    }

    /**
     * Function for removing given amount of money from budget
     * @param budgetRemoval of type double
     */
    public static void removeFromBudget(double budgetRemoval){
        Stock.stockBudget-=budgetRemoval;
    }

    /**
     * Function for adding given amount of money to udget
     * @param budgetAddition if type double
     */
    public static void addToBudget(double budgetAddition){
        Stock.stockBudget+=budgetAddition;
    }

    @Override
    public String toString(){
        return "Stock Budget" + Stock.stockBudget;
    }
    @Override
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