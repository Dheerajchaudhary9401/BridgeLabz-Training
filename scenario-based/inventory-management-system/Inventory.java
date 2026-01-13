import java.util.ArrayList;
class OutOfStockException extends Exception{
    OutOfStockException(String msg)
    {
        super(msg);
    }
}
class Inventory implements AlertService{
//    private int inventoryId;
//    private String productName;
//    private int quantity;
//    private double price;
//    private String stockStatus;
//    public Inventory(int inventoryId,String productName,int quantity,double price,String stockStatus){
//        this.inventoryId=inventoryId;
//        this.productName=productName;
//        this.quantity=quantity;
//        this.price=price;
//        this.stockStatus=stockStatus;
//    }
    public ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);

    }
    public void deleteProduct(Product product1) throws OutOfStockException{
        if(products.isEmpty()) {
            throw new OutOfStockException("out of stock reached");
        }
        products.remove(product1);

    }

            @Override
        public void sendAlert() {
            System.out.println("Low stocks...");
        }

    public void displayInventory(){
        System.out.println("--  Inventory  --");
        for(Product p : products){
            System.out.println("Product id: "+p.getProductId()+", Product name: "+p.getProductName()+", Price: "+p.getPrice());
        }
        if(products.size()<4){
            sendAlert();
        }

    }
}
