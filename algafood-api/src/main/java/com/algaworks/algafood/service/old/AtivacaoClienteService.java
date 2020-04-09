package com.algaworks.algafood.service.old;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;

//@Component
public class AtivacaoClienteService {
	/*
	 * Classe construida como exemplo de instanciação via configs externas
	 * sem o uso da anotação @Component
	 * 
	 * */
	private Notificador notificador;
	
	public AtivacaoClienteService (Notificador notificador) {
		this.notificador= notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
