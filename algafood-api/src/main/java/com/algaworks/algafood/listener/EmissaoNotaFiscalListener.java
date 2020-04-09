package com.algaworks.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.events.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalListener {

	@EventListener
	public void emissaoNotaFiscalListener(ClienteAtivadoEvent event) {
		System.out.println(event.getCliente().getNome() + " sua nota fiscal foi emitida!");
	}
	
}
