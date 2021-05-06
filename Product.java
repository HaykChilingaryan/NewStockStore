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

    public Product(String productNames, ProductType productType) {
        this.productName = productNames;
        this.productType = productType;

    }

    //Accessors
    public String getProductName() {
        return this.productName;
    }

    public String getProductType() {
        return this.productType.getProductTypeName();
    }


    //Mutators
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductType(ProductType productType) {
        int count = 0;
        for (ProductType prodType : ProductType.values()) {
            if (prodType == productType) {
                count++;
                break;
            }
        }
        if (count == 1) {
            this.productType = productType;
        }
    }


    //Enumerations
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


    //Methods
    public String toString() {
        return this.getProductName();
    }

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