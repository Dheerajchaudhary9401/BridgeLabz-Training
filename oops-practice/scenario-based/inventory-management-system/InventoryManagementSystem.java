public class InventoryManagementSystem {
    public static void main(String[] args) {
        //System.out.println("-- Inventory --");
        Product p1 = new Product(123,"mobile",52000);
        Product p2 = new Product(124,"laptop",152000);
        Product p3 = new Product(125,"mobile",52000);
        Product p4 = new Product(126,"laptop",152000);
        Product p5 = new Product(128,"mobile",52000);

        Inventory inventory = new Inventory();
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.displayInventory();
        inventory.addProduct(p4);
        inventory.addProduct(p5);
        try{
            inventory.deleteProduct(p2);
        }
        catch(OutOfStockException e){
            System.out.println(e.getMessage());

        }

        inventory.displayInventory();

    }
}
