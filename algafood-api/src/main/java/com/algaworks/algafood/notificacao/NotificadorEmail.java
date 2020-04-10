package com.algaworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.properties.NotificadorProperties;

@Profile("prod")
@Primary
@Component
public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties notificadorProperties;
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.println(notificadorProperties.getHostServidor());
		System.out.println(notificadorProperties.getPortaServidor());
		System.out.printf("Notificação %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
		
	}
}
