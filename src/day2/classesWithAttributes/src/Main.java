package day2.classesWithAttributes.src;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.price = 8000;
		product.stockAmount = 11;
		product.renk = "Siyah";

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		//productManager.add2(2, "", "", 0, 2);
	}

}
