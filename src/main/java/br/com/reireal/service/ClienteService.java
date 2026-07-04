package br.com.reireal.service;

import org.springframework.stereotype.Service;
import br.com.reireal.domain.entity.Cliente;
import br.com.reireal.repository.ClienteRepository;

@Service
public class ClienteService{
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}