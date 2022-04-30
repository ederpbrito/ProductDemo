package br.com.neon.ProductsDemo.domain;

public class Payment {
	
	private final String idClient;
	private final String uuid_operation;
	private final String nameProduct;
	
	public Payment(String uuid_operation, String idClient, String nameProduct) {	
		this.uuid_operation = uuid_operation;		
		this.idClient = idClient;
		this.nameProduct = nameProduct;
	}

	public String getUuid_operation() {
		return uuid_operation;
	}

	public String getIdClient() {
		return idClient;
	}

	public String getNameProduct() {
		return nameProduct;
	}
	
}
