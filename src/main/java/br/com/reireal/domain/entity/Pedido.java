package br.com.reireal.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.reireal.domain.enums.StatusPedido;

public class Pedido {
    private UUID id;
    private LocalDate dataPedido;
    private BigDecimal valorTotal;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private StatusPedido status;
    private Usuario usuarioResponsavel;


    public Pedido(LocalDate dataPedido, BigDecimal valorTotal, boolean ativo, List<ItemPedido> itens, StatusPedido status, Usuario usuarioResponsavel,Cliente cliente) {
        this.id = UUID.randomUUID();
        validarDataPedido(dataPedido);
        this.dataPedido = LocalDate.now();
        validarValorTotal(valorTotal);
        this.valorTotal = valorTotal;
        validarCliente(cliente);
        this.cliente = cliente;
        validarItens(itens);
        this.itens = itens;
        validarStatus(status);
        this.status = StatusPedido.PENDENTE; 
        validarUsuarioResponsavel(usuarioResponsavel);
        this.usuarioResponsavel = usuarioResponsavel;
    }
    private void validarDataPedido(LocalDate dataPedido) {
        if (dataPedido == null) {
            throw new IllegalArgumentException("A data do pedido não pode ser nula.");
        }
    }
    private void validarValorTotal(BigDecimal valorTotal) {
        if (valorTotal == null || valorTotal.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor total do pedido não pode ser nulo ou negativo.");
        }
    }
    private void validarAtivo(boolean ativo) {
        // Não há validação específica para o campo ativo, mas você pode adicionar regras se necessário.
    }
    private void validarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente do pedido não pode ser nulo.");
        }
    }
    private void validarItens(List<ItemPedido> itens) {
        if (itens == null || itens.isEmpty()) {
            throw new IllegalArgumentException("A lista de itens do pedido não pode ser nula ou vazia.");
        }
    }
    private void validarStatus(StatusPedido status) {
        if (status == null) {
            throw new IllegalArgumentException("O status do pedido não pode ser nulo.");
        }
    }
    private void validarUsuarioResponsavel(Usuario usuarioResponsavel) {
        if (usuarioResponsavel == null) {
            throw new IllegalArgumentException("O usuário responsável não pode ser nulo.");
        }
    }
    public UUID getId() {
        return id;
    }
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public List<ItemPedido> getItens() {
        return itens;
    }
    public StatusPedido getStatus() {
        return status;
    }
    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }
}

