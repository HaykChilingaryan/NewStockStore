public class StoreProduct {
    private Product storeProduct;
    private int storeProductQuantity;
    private double storeProductBuyPrice;
    private double storeProductSellPrice;

    //
    //Constructors
    //
    /**
     * Constructor for creating obc=ject of type StoreProduct
     * @param product of type Product
     * @param quantity of type int
     * @param buyPrice of type double
     * @param sellPrice of type double
     */
    public StoreProduct(Product product, int quantity, double buyPrice, double sellPrice){
        this.storeProduct = product;
        if(buyPrice > 0){
            this.storeProductBuyPrice = buyPrice;
        }
        if(sellPrice > 0){
            this.storeProductSellPrice = sellPrice;
        }
        if(quantity >= 0 ){
            this.storeProductQuantity = quantity;
        }
    }

    //
    //Accessors
    //
    /**
     * Function for getting Product
     * @return Product
     */
    public Product getStoreProduct(){
        return this.storeProduct;
    }

    /**
     * Function for getting Product Quantity
     * @return integer
     */
    public int getStoreProductQuantity(){
        return this.storeProductQuantity;
    }

    /**
     * Function for getting Product buy Price
     * @return double
     */
    public double getStoreProductBuyPrice() {
        return storeProductBuyPrice;
    }

    /**
     * Function for getting Product Sell Price
     * @return double
     */
    public double getStoreProductSellPrice() {
        return storeProductSellPrice;
    }

    //
    //Mutators
    //
    /**
     * Function for setting Product Buy Price
     * @param storeProductBuyPrice of type double
     */
    public void setStoreProductBuyPrice(double storeProductBuyPrice) {
        if(storeProductBuyPrice > 0){
            this.storeProductBuyPrice = storeProductBuyPrice;
        }
    }

    /**
     * Function for setting Product Sell price
     * @param storeProductSellPrice of type double
     */
    public void setStoreProductSellPrice(double storeProductSellPrice) {
        if(storeProductSellPrice > 0){
            this.storeProductSellPrice = storeProductSellPrice;
        }
    }

    /**
     * Function for setting Product
     * @param product of type Product
     */
    public void setStoreProduct(Product product){
        this.storeProduct = product;
    }

    /**
     * Function for setting Product quantity
     * @param quantity of type int
     * @throws InvalidStoreProductAction thrown when invalid input is done
     */
    public void setStoreProductQuantity(int quantity) throws InvalidStoreProductAction{
         if(quantity >= 0){
             this.storeProductQuantity = quantity;
         }
         else{
             throw new InvalidStoreProductAction("The quantity can't be a negative number");
         }
    }


    /**
     * Function for adding specific quantity of given product to this product
     * @param product of type StoreProduct
     * @throws InvalidStoreProductAction thrown when invalid action done to StoreProduct
     */
    public void addQuantity(StoreProduct product) throws InvalidStoreProductAction {
        try{
            this.setStoreProductQuantity(this.getStoreProductQuantity()+ product.getStoreProductQuantity());
        }
        catch (InvalidStoreProductAction e){
            System.out.println(e.getMessage());
        }

    }
    /**
     * Function for removing specific quantity of given product from this product
     * @param product of type StoreProduct
     * @throws InvalidStoreProductAction thrown when invalid action done to StoreProduct
     */
    public void removeQuantity(StoreProduct product) throws InvalidStoreProductAction{
        try{
            this.setStoreProductQuantity(this.getStoreProductQuantity()- product.getStoreProductQuantity());
        }
        catch (InvalidStoreProductAction e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString(){
        return this.storeProduct.getProductName() + " |  Quantity: " + this.storeProductQuantity + " | Sell Price: " + this.getStoreProductSellPrice() + " | Buy Price "+this.getStoreProductBuyPrice();
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof StoreProduct){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        StoreProduct cloned = (StoreProduct)super.clone();
        cloned.setStoreProduct((Product)cloned.getStoreProduct().clone());
        return cloned;
    }
}
 