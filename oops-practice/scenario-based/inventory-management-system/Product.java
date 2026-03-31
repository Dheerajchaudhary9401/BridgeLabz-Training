public class Product {
    int productId;
    String productName;
    int  price;
    public Product(int productId,String productName,int price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }

    public int getProductId() {
        return productId;
    }
    public String getProductName(){
        return productName;
    }

    public int getPrice() {
        return price;
    }
}
