package br.com.reireal.domain.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemPedido {
    private UUID id;
    private Integer quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal subTotal;
    private Produto produto;
   

public ItemPedido(Produto produto){
    validarProduto(produto);
    this.id = UUID.randomUUID();
    this.produto = produto;
    this.quantidade = 1;
    this.valorUnitario = produto.getValorUnitario();
    this.subTotal = calcularSubTotal();
    }
    public UUID getId() {
        return id;
    }
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }
   public BigDecimal getSubTotal() {
    return subTotal;
}
    public Produto getProduto() {
        return produto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void alterarQuantidade(Integer quantidade) {
        validarQuantidade(quantidade);
        this.quantidade = quantidade;
        this.subTotal = calcularSubTotal();
    }
    public void aumentarQuantidade(Integer quantidade) {
        validarQuantidade(quantidade);
        this.quantidade += quantidade;
        this.subTotal = calcularSubTotal();
    }
    public void diminuirQuantidade(Integer quantidade) {
        validarQuantidade(quantidade);
        if (this.quantidade - quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade não pode ser menor ou igual a zero");
        }
        this.quantidade -= quantidade;
        this.subTotal = calcularSubTotal();
    }
    private BigDecimal calcularSubTotal() {
        return this.valorUnitario.multiply(BigDecimal.valueOf(this.quantidade));
    }
    private void validarProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("O produto não pode ser nulo");
        }
    }
    private void validarQuantidade(Integer quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("A quantidade deve ser maior que zero");
        }
    }

}