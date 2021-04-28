package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Constructor  bos yapisi calisti");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		
		this ();// bunu yazarsak yukaridaki metotda calisir
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	
	int id;  // her nesneye özgü bir numara (TC Kimlik numarasi gibi) atariz. Standart uygulamadir
	String name;
	double unitPrice;
	String detail;
}
