import java.util.ArrayList;

public class Product {
    private String productName;
    private ProductType productType;
    public static ArrayList<Product> productList = new ArrayList<Product>() {
        {
            add(new Product("Macun", ProductType.DAIRY));
            add(new Product("Sour Cream", ProductType.DAIRY));
            add(new Product("Milk", ProductType.DAIRY));
            add(new Product("Cheese", ProductType.DAIRY));
            add(new Product("Orange Juice", ProductType.JUICE));
            add(new Product("Apple Juice", ProductType.JUICE));
            add(new Product("Cheesecake", ProductType.SWEETS));
            add(new Product("Brownie", ProductType.SWEETS));
            add(new Product("Napoleon", ProductType.SWEETS));
            add(new Product("Cone", ProductType.ICECREAM));
            add(new Product("Eskimo", ProductType.ICECREAM));
            add(new Product("Caramel Ice Cream", ProductType.ICECREAM));
        }
    };

    /**
     * Constructor for creating object of type Product
     * @param productNames of type String
     * @param productType of enum type ProductType
     */
    public Product(String productNames, ProductType productType) {
        this.productName = productNames;
        this.productType = productType;

    }

    public Product(Product product){
        this.productName = product.productName;
        this.productType = product.productType;
    }

    //
    //Accessors
    //
    /**
     * Function to get Product name
     * @return String
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * Function to get Product Type
     * @return String
     */
    public String getProductType() {
        return this.productType.getProductTypeName();
    }

    //
    //Mutators
    //
    /**
     * Function for setting Product name
     * @param productName of type String
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Function for setting Product type
     * @param productType if type ProductType
     */
    public void setProductType(ProductType productType) {
            this.productType = productType;
    }

    //
    //Enumerations
    //

    /**
     * Enumeration for Product types
     */
    public enum ProductType {
        NULL(""),
        DAIRY("Dairy"),
        SWEETS("Sweets"),
        ICECREAM("Ice Cream"),
        JUICE("Juice");

        ProductType(String name) {
            productTypeName = name;
        }

        private String productTypeName;

        public String getProductTypeName() {
            return productTypeName;
        }

        public void setProductType(String productTypeName) {
            this.productTypeName = productTypeName;
        }
    }

    //
    //Methods
    //
    @Override
    public String toString() {
        return this.getProductName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Product) {
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}