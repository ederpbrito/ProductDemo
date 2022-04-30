package br.com.neon.ProductsDemo.domain;

import java.io.Serializable;

public class Debit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String idclient;
	private String uuid_operation;
	private String status;
	private String description;
	
	public Debit() {}
	
	public Debit(String idclient, String uuid_operation, String status, String description) {		
		this.idclient = idclient;
		this.uuid_operation = uuid_operation;
		this.status = status;
		this.description = description;
	}

	public String getIdclient() {
		return idclient;
	}

	public String getUuid_operation() {
		return uuid_operation;
	}

	public String getStatus() {
		return status;
	}

	public String getDescription() {
		return description;
	}	
}
