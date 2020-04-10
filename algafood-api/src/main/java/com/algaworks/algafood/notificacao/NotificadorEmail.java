package com.algaworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Profile("prod")
@Primary
@Component
public class NotificadorEmail implements Notificador {

	@Value("${notificador.email.host-servidor}")
	private String host;
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.println(host);
		System.out.println(porta);
		System.out.printf("Notificação %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
		
	}
}
