package br.com.reireal.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.reireal.domain.entity.Cliente;
import br.com.reireal.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;;

@RestController
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
@PostMapping("Cliente")
public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
    return (Cliente) clienteService.cadastrarCliente(cliente);
}

}
