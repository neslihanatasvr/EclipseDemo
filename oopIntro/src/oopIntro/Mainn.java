package oopIntro;

public class Mainn {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenova V14");
		product1.setDetail("16 GB RAM");
		product1.setUnitPrice(1000);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenova V15");
		product2.setDetail("32 GB RAM");
		product2.setUnitPrice(16000);
		
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Hp 5");
		product3.setDetail("16 GB RAM");
		product3.setUnitPrice(10000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1= new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category1.setId(2);
		category1.setName("Yiyecek");
		System.out.println();
		
		
		
		
		
		
	}

}
