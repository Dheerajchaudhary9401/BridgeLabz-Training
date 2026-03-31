package set4;

import java.util.*;

public class SupermarketStoreInventory {
	static abstract class Product{
		String name;
		double price;
		int quantity;
		public Product(String name, double price, int quantity) {
			this.name=name;
			this.price=price;
			this.quantity=quantity;
		}
		abstract void displayDetails();
		
	}
	static class Electronics extends Product{
		
		int warranty;
		public Electronics(String name, double price, int quantity, int warranty) {
			super(name,price,quantity);
			this.warranty=warranty;
		}
		public void displayDetails() {
			System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Warranty: "+warranty+" months");
		}
		
	}
	static class Clothing extends Product{
		
		String size;
		public Clothing(String name, double price, int quantity, String size) {
			super(name,price,quantity);
			this.size=size;
		}
		public void displayDetails() {
			System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Size: "+size);
		}
		
	}
	static class ProductManager{
		List<Product> product = new ArrayList<>();
		void add(Product prdct) {
			product.add(prdct);
			System.out.println("Product added to inventory: "+prdct.name);
		}
		void displayDetail() {
			for(Product p: product) {
				p.displayDetails();
			}
		}
		void totalValue() {
			double sum=0;
			for(Product p: product) {
				sum+=(p.price*p.quantity);
			}
			System.out.println("Total value of the inventory: "+sum);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductManager pm = new ProductManager();
		int n= sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] Strings = s.split(",");
			if(Strings[0].equals("Electronics")) {
				pm.add(new Electronics(Strings[1].trim(),Double.parseDouble(Strings[2].trim()),Integer.parseInt(Strings[3].trim()),Integer.parseInt(Strings[4].trim())));
			}
			if(Strings[0].equals("Clothing")) {
				pm.add(new Clothing(Strings[1].trim(),Double.parseDouble(Strings[2].trim()),Integer.parseInt(Strings[3].trim()),Strings[4].trim()));
			}
			
		}
		System.out.println("Inventory:");
		pm.displayDetail();
		System.out.print("Total value of the inventory: ");
		pm.totalValue();

	}

}
