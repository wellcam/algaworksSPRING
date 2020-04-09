package com.algaworks.algafood.notificacao.old;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;

//@Component
public class NotificadorEmail implements Notificador {
	/*
	 * Classe construida como exemplo de instanciação via configs externas
	 * sem o uso da anotação @Component
	 * 
	 * */
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar (Cliente cliente, String mensagem) {
		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificação %s através do e-mail %s usando SMTP %s: %s\n",
				cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
		
	}

	public void setCaixaAlta(boolean status) {
		this.caixaAlta = status;
		
	}
}
