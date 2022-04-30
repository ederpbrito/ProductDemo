package br.com.neon.ProductsDemo.Controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.neon.ProductsDemo.domain.Debit;
import br.com.neon.ProductsDemo.domain.Payment;
import br.com.neon.ProductsDemo.domain.ReturnProduct;
import br.com.neon.ProductsDemo.domain.ServiceDebit;

@RestController
public class ProductController {

	private final int timeSleep = 1000;
	
	@Autowired
	private ServiceDebit service;
	
	@PostMapping("/payment/billing")
	ReturnProduct debitBilling(@RequestBody Payment payment) throws InterruptedException, ExecutionException {		
		ReturnProduct ret = new ReturnProduct(payment.getNameProduct(), "200", payment.getUuid_operation());		
		Thread.sleep(timeSleep);
		service.dispatcher(new Debit(payment.getIdClient(), payment.getUuid_operation(), "success" ,"processed"));
		return ret;
	}
	
	@PostMapping("/payment/pix")
	ReturnProduct debitPIX(@RequestBody Payment payment) throws InterruptedException, ExecutionException {		
		ReturnProduct ret = new ReturnProduct(payment.getNameProduct(), "200", payment.getUuid_operation());		
		Thread.sleep(timeSleep);
		service.dispatcher(new Debit(payment.getIdClient(), payment.getUuid_operation(), "success" ,"processed"));
		return ret;
	}
	
	@PostMapping("/payment/emprestimopessaol")
	ReturnProduct debitEP(@RequestBody Payment payment) throws InterruptedException, ExecutionException {		
		ReturnProduct ret = new ReturnProduct(payment.getNameProduct(), "200", payment.getUuid_operation());		
		Thread.sleep(5000);
		service.dispatcher(new Debit(payment.getIdClient(), payment.getUuid_operation(), "success" ,"processed"));
		return ret;
	}
	
	@PostMapping("/payment/boleto")
	ReturnProduct debitBoleto(@RequestBody Payment payment) throws InterruptedException, ExecutionException {		
		ReturnProduct ret = new ReturnProduct(payment.getNameProduct(), "200", payment.getUuid_operation());		
		Thread.sleep(timeSleep);
		service.dispatcher(new Debit(payment.getIdClient(), payment.getUuid_operation(), "success" ,"processed"));
		return ret;
	}
}
