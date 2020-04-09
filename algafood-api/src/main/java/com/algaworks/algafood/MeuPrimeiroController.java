package com.algaworks.algafood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	@Autowired
	private AtivacaoClienteService ativacaoClienteService; 
	
//	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
//		this.ativacaoClienteService = ativacaoClienteService;
//		
//		System.out.println("MeuPrimeiroController " + ativacaoClienteService);
//	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente cliente = new Cliente("Wellington", "wel@oi", "123456789");
		
		ativacaoClienteService.ativar(cliente);
		
		return "Safadão";
	}

}
