package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V14", 15000, "16 GB Ram");
		
		
		Product product2 = new Product(); //referans oluþturma
		product2.id =2;
		product2.name ="Lenovo V15";
		product2.unitPrice = 15000;
		product2.detail ="32 gb Ram"; 
		
		Product product3 = new Product(); //referans oluþturma
		product3.id =1;
		product3.name ="Hp ";
		product3.unitPrice = 15000;
		product3.detail ="32 gb Ram"; 
		
		Product[] products = {product1,product2,product3};
				
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		Category category = new Category();
		category.id =1;
		category.name ="Bilgisayar";
		
		Category category2 = new Category();
		category2.id =2;
		category2.name ="Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		
	};
		

	}


