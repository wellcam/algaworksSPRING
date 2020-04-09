package com.algaworks.algafood.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

//@Primary
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar (Cliente cliente, String mensagem) {
		
		System.out.printf("Notificação %s por SMS  %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
		
	}
}
