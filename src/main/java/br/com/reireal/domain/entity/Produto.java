package br.com.reireal.domain.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class Produto {
    private UUID id;
    private String nome;
    private BigDecimal preco;
    private Integer estoque;
    private boolean ativo;
    private Categoria categoria;


    public Produto(String nome, BigDecimal preco, Integer estoque,Categoria categoria) {
       this.id = UUID.randomUUID();
       validarNome(nome);
        this.nome = nome;
        validarPreco(preco);
        this.preco = preco;
        validarEstoque(estoque);
        this.estoque = estoque;
        ativar();
        validarCategoria(categoria);
        this.categoria = categoria;
    }
    public UUID getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void alterarNome(String nome) {
        validarNome(nome);
        this.nome = nome;
    }
    public void alterarPreco(BigDecimal preco) {
        validarPreco(preco);
        this.preco = preco;
    }
public void aumentarEstoque(Integer quantidade) {
        validarQuantidade(quantidade);
        this.estoque += quantidade;
    }
    public void reduzirEstoque(Integer quantidade) {
        validarQuantidade(quantidade);
        if (this.estoque - quantidade < 0) {
            throw new IllegalArgumentException("Quantidade insuficiente para a redução.");
        }
        this.estoque -= quantidade;
    }
    public void ativar() {
        if(this.ativo){
            throw new IllegalArgumentException("Produto já está ativo.");
        }
        this.ativo = true;
    }
    public void desativar() {
        if(!this.ativo){
            throw new IllegalArgumentException("Produto já está desativado.");
        }
        this.ativo = false;
    }
    public void alterarCategoria(Categoria categoria) {
        validarCategoria(categoria);
        this.categoria = categoria;
    }
    private void validarNome(String nome){
        if(nome == null || nome.isBlank() || nome.length() > 100 || !nome.matches("^[a-zA-Z0-9 ]+$")){
            throw new IllegalArgumentException("Nome inválido. O nome deve conter apenas letras, números e espaços, e ter no máximo 100 caracteres.");}
    }
    private void validarPreco(BigDecimal preco){
        if(preco == null || preco.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Preço inválido. O preço deve ser maior que zero.");
        }
    }
    private void validarEstoque(Integer estoque){
        if(estoque == null || estoque < 0){
            throw new IllegalArgumentException("Estoque inválido. O estoque não pode ser negativo.");
        }
    }
    private void validarQuantidade(Integer quantidade){
        if(quantidade == null || quantidade <= 0){
            throw new IllegalArgumentException("Quantidade inválida. A quantidade não pode ser negativa.");
        }
    } 
    private void validarCategoria(Categoria categoria){
        if(categoria == null){
            throw new IllegalArgumentException("Categoria inválida. A categoria não pode ser nula.");
        }
    }
    
}
