package com.algaworks.algafood.configs;

import org.springframework.context.annotation.Bean;

import com.algaworks.algafood.notificacao.old.NotificadorEmail;

//@Configuration
public class NotificadorConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.gmail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
}
