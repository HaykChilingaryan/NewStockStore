public class StoreProduct {
    private Product storeProduct;
    private int storeProductQuantity;
    private double storeProductBuyPrice;
    private double storeProductSellPrice;


    public void setStoreProductBuyPrice(double storeProductBuyPrice) {
        if(storeProductBuyPrice > 0){
            this.storeProductBuyPrice = storeProductBuyPrice;
        }
    }

    public void setStoreProductSellPrice(double storeProductSellPrice) {
        if(storeProductSellPrice > 0){
            this.storeProductSellPrice = storeProductSellPrice;
        }
    }


    public Product getStoreProduct(){
        return this.storeProduct;
    }
    public int getStoreProductQuantity(){
        return this.storeProductQuantity;
    }
    public double getStoreProductBuyPrice() {
        return storeProductBuyPrice;
    }
    public double getStoreProductSellPrice() {
        return storeProductSellPrice;
    }
 
    public void setStoreProduct(Product product){
        this.storeProduct = product;
    }
    public void setStoreProductQuantity(int quantity) throws InvalidStoreProductAction{
         if(quantity >= 0){
             this.storeProductQuantity = quantity;
         }
         else{
             throw new InvalidStoreProductAction("The quantity can't be a negative number");
         }
    }

 
 
    public StoreProduct(Product product, int quantity, double buyPrice, double sellPrice){
         this.storeProduct = product;
        if(buyPrice > 0){
            this.storeProductBuyPrice = buyPrice;
        }
        if(sellPrice > 0){
            this.storeProductBuyPrice = sellPrice;
        }
         if(quantity >= 0 ){
             this.storeProductQuantity = quantity;
         }
    }
 
    public void addQuantity(StoreProduct product){
        this.storeProductQuantity+=product.storeProductQuantity;
    }
    public void removeQuantity(StoreProduct product){
        this.storeProductQuantity-=product.storeProductQuantity;
    }
    public String toString(){
        return this.storeProduct.getProductName() + "  Quantity: " + this.storeProductQuantity + "  Sell Price: " + this.getStoreProductSellPrice() + "  Buy Price "+this.getStoreProductBuyPrice();
    }
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
 