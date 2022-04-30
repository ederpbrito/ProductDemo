package br.com.neon.ProductsDemo.domain;

public class ReturnProduct {

	private final String nameProduct;
	private final String status;
	private final String uuid_operation;	
	
	public ReturnProduct(String nameProduct, String status, String uuid_operation) {
		super();
		this.nameProduct = nameProduct;
		this.status = status;
		this.uuid_operation = uuid_operation;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public String getStatus() {
		return status;
	}

	public String getUuid_operation() {
		return uuid_operation;
	}
	
}
