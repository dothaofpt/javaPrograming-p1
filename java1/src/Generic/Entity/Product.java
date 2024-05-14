package Generic.Entity;

public class Product extends Entity<Product>{
    public int productID;
    public String productName;
    public String productDescription;
    public int price;
    public int stockQuantity;

    public Product(int productID, String productName, String productDescription, int price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Product() {

    }

    public Product(int prodId, String name, String productDesc, double price) {

    }

    public Product(int productId) {
        this.productID = productId;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getProductDesc() {
        return null;
    }

    public void setProductId(int anInt) {
    }

    public void setProductDesc(String string) {
    }

    public void setPrice(String string) {
    }
}
