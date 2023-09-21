package com.isabela.Isabela.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isabela.Isabela.entities.Cliente;
import com.isabela.Isabela.repository.ClienteRepository;

@Service
public class ClienteService {
private final ClienteRepository clienteRepository;
	
	
	@Autowired
	public ClienteService(ClienteRepository  clienteRepository) {
	this.clienteRepository = clienteRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getClienteByIdcCliente(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}

	public List<Cliente> getAllCliente(){
		return clienteRepository.findAll();
	}
	
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
}
