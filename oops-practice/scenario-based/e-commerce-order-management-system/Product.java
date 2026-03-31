class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        System.out.println("Product Created:");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
