package day2.classesWithAttributes.src;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(8000);
		product.setStockAmount(11);
		product.setRenk("Siyah");

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
	}

}
