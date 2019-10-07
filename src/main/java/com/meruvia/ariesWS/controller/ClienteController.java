package com.meruvia.ariesWS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meruvia.ariesWS.model.Cliente;
import com.meruvia.ariesWS.repository.ClienteRepository;

@RestController
@RequestMapping("/aries")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/cliente")
	public List<Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente getPersonalById(@PathVariable(value = "id") int clienteId) {
		Cliente cliente = clienteRepository.findById(clienteId);
		return cliente;
	}
	
}
