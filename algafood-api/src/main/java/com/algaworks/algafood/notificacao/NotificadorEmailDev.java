package com.algaworks.algafood.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Profile("dev")
//@Primary
@Component
public class NotificadorEmailDev implements Notificador {

	@Override
	public void notificar (Cliente cliente, String mensagem) {
		
		System.out.printf("Notificação %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
		
	}
}
