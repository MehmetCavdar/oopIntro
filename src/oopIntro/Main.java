package oopIntro;

public class Main {

	public static void main(String[] args) {
		//Hepsiburada.com daki gibi yapiyi olusturalim
		
		Product product1 = new Product(1,"Lenovo V14", 15000, "16 GB Ram" ); // örnek, referans, instance olusturma
	
		
		Product product2 = new Product(2, "Lenovo V15", 5000, "32 GB Ram");
		
		Product product3 = new Product(3, "HP 5", 10000, "8 GB Ram");
		
		
		Product product4 = new Product();
		
		//Dizi tanimlama
		Product[] products = {product1, product2, product3};  //ürünleri diziye ekledik
		
		System.out.println("Ürünler:");
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println("Ürün sayisi " + products.length);
		
		Category category1 = new Category(); // örnek, referans, instance olusturma
		category1.id=1;
		category1.name= "Bilgisayar";
		
		Category category2 = new Category(); // örnek, referans, instance olusturma
		category2.id=2;
		category2.name= "Ev/Bahce";
		
		//Dizi tanimlama
		Category[] categories = {category1, category2};  //ürünleri diziye ekledik
		
		System.out.println("Kategoriler:");
		for (Category category : categories) {
			System.out.println(category.name);
		}
			
		System.out.println("Kategori sayisi" + categories.length);
	}
}
