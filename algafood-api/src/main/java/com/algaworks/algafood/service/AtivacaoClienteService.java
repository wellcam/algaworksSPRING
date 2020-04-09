package com.algaworks.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.events.ClienteAtivadoEvent;
import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private Notificador notificador;
	
	@Autowired
	private ApplicationEventPublisher event;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		event.publishEvent(new ClienteAtivadoEvent(cliente));
	}
}
