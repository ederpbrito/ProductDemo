package br.com.neon.ProductsDemo.domain;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Component;

import br.com.neon.ProductsDemo.kafka.KafkaDispatcher;


@Component
public class ServiceDebit {

	public void dispatcher(Debit debit) throws InterruptedException, ExecutionException {

		try (var orderDispatcher = new KafkaDispatcher<Debit>()) {
			System.out.println("Cliente gerado: " + debit.getIdclient());
			System.out.println("Gerando evento de debito em conta operation_uuid: " + debit.getUuid_operation());
			orderDispatcher.send("ORQUESTRATION_NEW_DEBIT", debit.getIdclient(), debit);
		}
	}
}
