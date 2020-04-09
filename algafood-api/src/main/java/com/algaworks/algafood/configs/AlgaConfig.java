package com.algaworks.algafood.configs;

import org.springframework.context.annotation.Bean;

import com.algaworks.algafood.notificacao.old.NotificadorEmail;
import com.algaworks.algafood.service.old.AtivacaoClienteService;

//@Configuration
public class AlgaConfig {

	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.gmail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}
