package br.com.reireal.domain.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nome;
    private String telefone;
    private String email ;
    private LocalDate dataNascimento;
    private boolean ativo;
    private LocalDate dataCadastro;

    public Cliente (String nome, String telefone, String email, LocalDate dataNascimento) {
         validarNome(nome);
         validarTelefone(telefone);
         validarEmail(email);
         validarDataNascimento(dataNascimento);
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.ativo = true;
        this.dataCadastro = LocalDate.now();
    }
    public UUID getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void ativar() {
        this.ativo = true;
    }
    public void alterarNome(String nome) {
        validarNome(nome);
        this.nome = nome;
    }
    public void alterarTelefone(String telefone) {
        validarTelefone(telefone);
        this.telefone = telefone;
    }
    public void alterarEmail(String email) {
        validarEmail(email);
        this.email = email;
    }
   public void desativar() {
        if (!this.ativo) {
            throw new IllegalStateException("Cliente já está desativado.");
        }
        this.ativo = false;
    }
    private void validarNome(String nome){
        if (nome == null || nome.isBlank() || nome.length() < 3 || nome.length() > 50 || !nome.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
            throw new IllegalArgumentException("Nome inválido. Deve conter entre 3 e 50 caracteres e apenas letras.");
        }
    }
    private void validarTelefone(String telefone){
        if(telefone == null || telefone.isBlank() || !telefone.matches("^\\(\\d{2}\\) \\d{4,5}-\\d{4}$")){
            throw new IllegalArgumentException("Telefone inválido. Deve estar no formato (XX) XXXXX-XXXX.");
        }
    }
    private void validarEmail(String email){
        final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if(email == null || email.isBlank() || !email.matches(EMAIL_REGEX)){
            throw new IllegalArgumentException("Email inválido. Deve estar no formato nome@dominio.com.");
        }
    }
    private void validarDataNascimento(LocalDate dataNascimento){
        if(dataNascimento == null || dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de nascimento inválida. Deve ser uma data passada.");
        }
        LocalDate dataLimite = LocalDate.now().minusYears(15);
        if(dataNascimento.isAfter(dataLimite)){
            throw new IllegalArgumentException("Cliente deve ter pelo menos 15 anos.");
        }
    }
    }