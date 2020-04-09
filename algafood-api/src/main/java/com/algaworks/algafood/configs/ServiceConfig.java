package com.algaworks.algafood.configs;

import org.springframework.context.annotation.Bean;

import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.service.old.AtivacaoClienteService;

//@Configuration
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
	
}
