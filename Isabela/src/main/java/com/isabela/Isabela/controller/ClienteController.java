package com.isabela.Isabela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isabela.Isabela.entities.Cliente;
import com.isabela.Isabela.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	private final ClienteService clienteService;

	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}

	@GetMapping("/{idcCliente}")
	public Cliente getCliente(@PathVariable Long idcCliente) {
		return clienteService.getClienteByIdcCliente(idcCliente);
	}

	@GetMapping
	public List<Cliente> getAllCliente() {
		return clienteService.getAllCliente();
	}

	@DeleteMapping("/{idcCliente}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);
	}

}
